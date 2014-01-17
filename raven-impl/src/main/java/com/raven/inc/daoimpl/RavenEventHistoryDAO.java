package com.raven.inc.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.raven.inc.dao.IRavenEventHistoryDAO;
import com.raven.inc.vo.RavenEventHistoryVO;

public class RavenEventHistoryDAO implements IRavenEventHistoryDAO {
	
	protected JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void saveRavenEventHistory(
			final ArrayList<RavenEventHistoryVO> ravenEventHistoryVOList) {
		
		final String sql="INSERT INTO raven_event_history(raven_events_id  ,raven_usr_id  ,raven_restaurant_menu ,"+
				"quantity  ,unit_price  ,created_date) VALUES (?,?,?,?,?,NOW(),NOW())";
				
				jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i)
							throws SQLException {
						RavenEventHistoryVO ravenEventHistoryVO = ravenEventHistoryVOList.get(i);
						ps.setLong(1, ravenEventHistoryVO.getRavenEventsId());
						ps.setLong(2, ravenEventHistoryVO.getRavenUsrId());
						ps.setLong(3, ravenEventHistoryVO.getRavenRestaurantMenu());
						ps.setInt(4, ravenEventHistoryVO.getQuantity());
						ps.setDouble(5, ravenEventHistoryVO.getUnitPrice());
						
						
						
						
					}

					public int getBatchSize() {
						return ravenEventHistoryVOList.size();
					}
				});
		
	}

	

}
