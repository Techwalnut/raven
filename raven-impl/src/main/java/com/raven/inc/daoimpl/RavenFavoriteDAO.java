package com.raven.inc.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.raven.inc.dao.IRavenFavoriteDAO;
import com.raven.inc.vo.RavenEventHistoryVO;
import com.raven.inc.vo.RavenFavoriteVO;

public class RavenFavoriteDAO implements IRavenFavoriteDAO {

	protected JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void saveRavenFavorite(final ArrayList<RavenFavoriteVO> ravenFavoriteVOList) {

		final String sql="INSERT INTO raven_favourite("+
		   "raven_restaurant_id,raven_usr_id,status,created_date ,modified_date) VALUES (?,?,?,NOW(),NOW())";
		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
			public void setValues(PreparedStatement ps, int i)
					throws SQLException {
				RavenFavoriteVO ravenFavoriteVO = ravenFavoriteVOList.get(i);
				ps.setLong(1, ravenFavoriteVO.getRavenRestaurantId());
				ps.setLong(2, ravenFavoriteVO.getRavenUsrId());
				ps.setLong(3, ravenFavoriteVO.getStatus());
			
		
			}

			public int getBatchSize() {
				return ravenFavoriteVOList.size();
			}
		});
		

		
	}
	
	
	
	

}
