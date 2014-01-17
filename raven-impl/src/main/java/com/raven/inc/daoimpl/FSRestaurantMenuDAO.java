package com.raven.inc.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.raven.inc.dao.IFSRestaurantMenuDAO;
import com.raven.inc.vo.FsRestaurantMenuVO;

public class FSRestaurantMenuDAO implements IFSRestaurantMenuDAO {
 
	protected JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void saveRestaurantMenu(final ArrayList<FsRestaurantMenuVO> fsRestaurantMenuVOList)
	{
		final String sql="INSERT INTO fs_restaurant_menu(fs_restaurant_id  ,fs_menu_id  ,price  ,created_date  ,modified_date) VALUES (?,?,?,NOW(),NOW() )";
		
		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
			public void setValues(PreparedStatement ps, int i)
					throws SQLException {
				FsRestaurantMenuVO fsRestaurantMenuVO = fsRestaurantMenuVOList.get(i);
				ps.setLong(1, fsRestaurantMenuVO.getFsRestaurantId());
				ps.setLong(2, fsRestaurantMenuVO.getFsMenuId());
				ps.setDouble(3, fsRestaurantMenuVO.getPrice());
			}

			public int getBatchSize() {
				return fsRestaurantMenuVOList.size();
			}
		});
	}
}
