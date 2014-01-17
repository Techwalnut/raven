package com.raven.inc.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.raven.inc.dao.IYelpDAO;
import com.raven.inc.vo.CountryVO;
import com.raven.inc.vo.YelpVO;

public class YelpDAO implements IYelpDAO {
	protected JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void saveYelp(final ArrayList<YelpVO> yelpVOList) {
		
		
		final String sql="INSERT INTO yelp( fs_restaurant_id  ,raven_restaurant_id  ,review  ,created_date  ,modified_date)"+
				"VALUES (?,?,?,NOW(),NOW())";
				
				jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i)
							throws SQLException {
						YelpVO yelpVO = yelpVOList.get(i);
						ps.setLong(1, yelpVO.getFsRestaurantId());
						ps.setLong(2, yelpVO.getFsRestaurantId());
						ps.setString(3,yelpVO.getReview() );
						
					
					}

					@Override
					public int getBatchSize() {
						return yelpVOList.size();
					}
				});

		
		
	}

}
