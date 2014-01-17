package com.raven.inc.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.raven.inc.dao.IRavenRestaurantTimingDAO;
import com.raven.inc.vo.RavenFavoriteVO;
import com.raven.inc.vo.RavenRestaurantTimingVO;

public class RavenRestaurantTimingDAO implements IRavenRestaurantTimingDAO {
	
	protected JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override 
	public void saveRavenRestaurantTiming(final ArrayList<RavenRestaurantTimingVO> ravenRestaurantTimingVOList) {
		
		final String sql="INSERT INTO raven_favourite("+
				   "raven_restaurant_id,raven_usr_id,status,created_date ,modified_date) VALUES (?,?,?,NOW(),NOW())";
				jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i)
							throws SQLException {
						RavenRestaurantTimingVO ravenRestaurantTimingVO = ravenRestaurantTimingVOList.get(i);
						ps.setLong(1,ravenRestaurantTimingVO.getRavenRestaurantId());
						ps.setString(2, ravenRestaurantTimingVO.getWeekDay());
						//ps.setDate(3, ravenRestaurantTimingVO.getOpenTime());////date
						//ps.setDate(3, ravenRestaurantTimingVO.getCloseTime());//date
						
					
				
					}

					@Override
					public int getBatchSize() {
						return ravenRestaurantTimingVOList.size();
					}
				});
				

		
	}
	
	

}
