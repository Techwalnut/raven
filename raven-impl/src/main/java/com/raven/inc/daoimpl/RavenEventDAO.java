package com.raven.inc.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.raven.inc.dao.IRavenEventDAO;
import com.raven.inc.vo.LocalityVO;
import com.raven.inc.vo.RavenEventVO;

public class RavenEventDAO implements IRavenEventDAO {
	
	

	protected JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void saveRavenEvent(final ArrayList<RavenEventVO> rvEventVOList) {
		final String sql="INSERT INTO raven_events("+
		"raven_restaurant_id , is_completed ,event_date ,created_date  ,modified_date)"+
		 "VALUES (?,?,?,?,NOW(),NOW())";
		
		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
			public void setValues(PreparedStatement ps, int i)
					throws SQLException {
				RavenEventVO ravenEventVO = rvEventVOList.get(i);
				ps.setLong(1, ravenEventVO.getRavenRestaurantId());
				ps.setLong(2, ravenEventVO.getIsCompleted());
				//ps.setDate(3, ravenEventVO.getEventDate());//date type
				
				
				
			}

			public int getBatchSize() {
				return rvEventVOList.size();
			}
		});

		
	}
	

	
	

}
