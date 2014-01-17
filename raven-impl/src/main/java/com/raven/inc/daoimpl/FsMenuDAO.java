package com.raven.inc.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.raven.inc.dao.IFsMenuDAO;
import com.raven.inc.vo.FsMenuVO;

public class FsMenuDAO implements IFsMenuDAO {
	
	protected JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void saveFsMenu(final ArrayList<FsMenuVO> fsMenuVOlist) {
		final String sql="INSERT INTO fs_menu("+
		"cuisine_id  ,name  ,is_veg  ,is_starter  ,created_date  ,modified_date)"+
		"VALUES (?,?,?,?,NOW(),NOW())";

jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
	public void setValues(PreparedStatement ps, int i)
			throws SQLException {
		FsMenuVO fsMenuVO = fsMenuVOlist.get(i);
		ps.setLong(1, fsMenuVO.getCuisineId());
		ps.setString(2, fsMenuVO.getName());
		ps.setDouble(3, fsMenuVO.getIsVeg());
		ps.setDouble(4, fsMenuVO.getIsStarter());
		

	}

			public int getBatchSize() {
				return fsMenuVOlist.size();
			}
});
		
	}

	

	



		
	}
