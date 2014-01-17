package com.raven.inc.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.raven.inc.dao.IFSRestaurantTimingDAO;
import com.raven.inc.vo.FsRestaurantTimingVO;

public class FSRestaurantTimingDAO implements IFSRestaurantTimingDAO  {

	
	protected JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void saveFsRestaurantTiming(
			final ArrayList<FsRestaurantTimingVO> fsRestaurantTimingVOList) {

		final String sql = "INSERT INTO fs_restaurant(restaurent_id,name,address,cross_street," +
				"city,state,country,postal_code,lat,longt ," +
				"facebook_id  ,email_id  ,phone_number  ,url  ," +
				"verified ,type  ,other_info  ,is_raven_restaurent , created_date) "
				+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,NOW())";

		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
			public void setValues(PreparedStatement ps, int i)
					throws SQLException {
				FsRestaurantTimingVO fsRestaurantTimingVO = fsRestaurantTimingVOList.get(i);
				ps.setLong(1, fsRestaurantTimingVO.getFsRestaurantId());
				ps.setString(2, fsRestaurantTimingVO.getWeekDay());
				//ps.setDate(3, fsRestaurantTimingVO.getOpenTime());/// date
			

			}

			public int getBatchSize() {
				return fsRestaurantTimingVOList.size();
			}
		});
		
	}

	
	
}
