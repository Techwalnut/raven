package com.raven.inc.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.raven.inc.dao.IFSRestaurantPOSDAO;
import com.raven.inc.vo.FsRestaurantPOSVO;

public class FsRestaurantPosDAO implements IFSRestaurantPOSDAO {

	protected JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void saveFsRestaurantPos(
			final ArrayList<FsRestaurantPOSVO> fsRestaurantPOSVOList) {
	
		
		final String sql="INSERT INTO fs_restaurant_pos("+
				  "fs_restaurant_id  ,raven_pos_id  ,description  ,created_date  ,modified_date)"+
				 " VALUES (?,?,?,Now(),NOW())";
				
				jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i)
							throws SQLException {
						FsRestaurantPOSVO fsRestaurantPOSVO = fsRestaurantPOSVOList.get(i);
						ps.setLong(1, fsRestaurantPOSVO.getFsRestaurantId());
						ps.setLong(2, fsRestaurantPOSVO.getRavenPosId());
					    ps.setString(3, fsRestaurantPOSVO.getDescription());
						
						
						

					}

					public int getBatchSize() {
						return fsRestaurantPOSVOList.size();
					}
				});
	}
	
	
	
	

}
