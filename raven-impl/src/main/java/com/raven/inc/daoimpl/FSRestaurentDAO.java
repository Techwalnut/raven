package com.raven.inc.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.raven.inc.dao.IFSRestaurantDAO;
import com.raven.inc.vo.FSRestaurantVO;

@Service
public class FSRestaurentDAO implements IFSRestaurantDAO {

	protected JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	




	public void saveRestaurant(final ArrayList<FSRestaurantVO> fsRestaurantVOList) {
		
			try{
			
			System.out.println("inside dao add.............");
			final String sql = "INSERT INTO fs_restaurant(restaurant_id,name,address,cross_street," +
					"city,state,country,postal_code,lat,longt ," +
					"facebook_id  ,email_id  ,phone_number  ,url  ," +
					"verified ,type  ,other_info  ,is_raven_restaurent , created_date) "
					+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,NOW())";

			jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
				public void setValues(PreparedStatement ps, int i)
						throws SQLException {
					FSRestaurantVO fsRestaurantVO = fsRestaurantVOList.get(i);
					ps.setString(1, fsRestaurantVO.getRestaurentId());
					ps.setString(2, fsRestaurantVO.getName());
					ps.setString(3, fsRestaurantVO.getAddress());
					ps.setString(4, fsRestaurantVO.getCrossStreet());
					ps.setString(5, fsRestaurantVO.getCity());
					ps.setString(6, fsRestaurantVO.getState());
					ps.setString(7, fsRestaurantVO.getCountry());
					ps.setString(8, fsRestaurantVO.getPostalCode());
					ps.setDouble(9, fsRestaurantVO.getLat());
					ps.setDouble(10, fsRestaurantVO.getLongt());
					ps.setString(11, fsRestaurantVO.getFacebookId());
					ps.setString(12, fsRestaurantVO.getEmailId());
					ps.setString(13, fsRestaurantVO.getPhoneNumber());
					ps.setString(14, fsRestaurantVO.getUrl());
					ps.setBoolean(15, fsRestaurantVO.getVerified());
					ps.setString(16, fsRestaurantVO.getType());
					ps.setString(17, fsRestaurantVO.getOtherInfo());
					ps.setInt(18, fsRestaurantVO.getIsRavenRestaurent());

				}
				

				public int getBatchSize() {
					return fsRestaurantVOList.size();
				}
			});
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
		

		return;

		
	}






	public List<FSRestaurantVO> getRestaurantByLatLong(String latLong) {
		List<FSRestaurantVO> list = null;

		try {
			list = jdbcTemplate.query("select * from fs_restaurant",
					new BeanPropertyRowMapper<FSRestaurantVO>(
							FSRestaurantVO.class));
		} catch (Exception e) {
			System.out.println("ReportDaoImpl :: uploadErrorReport :: " + e);
		}

		return list;
	}

}
