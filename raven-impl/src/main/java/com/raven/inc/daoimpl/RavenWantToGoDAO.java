package com.raven.inc.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.raven.inc.dao.IRavenWantToGo;
import com.raven.inc.vo.RavenEventHistoryVO;
import com.raven.inc.vo.RavenWantsToGoVO;

public class RavenWantToGoDAO implements IRavenWantToGo {
	

	protected JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void saveRavenWantsToGo(final ArrayList<RavenWantsToGoVO> ravenWantsToGoVOlist) {
		
		
final String sql="INSERT INTO raven_db_pappu.raven_want_to_go("+
"raven_restaurant_id ,raven_usr_id ,status ,created_date ,modified_date)VALUES(?,?,?,NOW(),NOW())";
		
		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
			public void setValues(PreparedStatement ps, int i)
					throws SQLException {
				RavenWantsToGoVO ravenWantsToGoVO = ravenWantsToGoVOlist.get(i);
				ps.setLong(1, ravenWantsToGoVO.getRavenRestaurantId());
				ps.setLong(2, ravenWantsToGoVO.getRavenUsrId());
				ps.setInt(3, ravenWantsToGoVO.getStatus());
				
			}

			@Override
			public int getBatchSize() {
				return ravenWantsToGoVOlist.size();
			}
		});
		
		
		
	}

}
