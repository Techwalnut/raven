package com.raven.inc.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.raven.inc.dao.ILocalityDAO;
import com.raven.inc.vo.LocalityVO;

public class LocalityDAO implements ILocalityDAO {
	
	

	protected JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void saveLocality(final ArrayList<LocalityVO> localityVOList) {
final String sql="INSERT INTO locality(name,code,pin_code,city_id) VALUES (?,?,?,?)";
		
		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
			public void setValues(PreparedStatement ps, int i)
					throws SQLException {
				LocalityVO localityVO = localityVOList.get(i);
				ps.setString(1, localityVO.getName());
				ps.setString(2,localityVO.getCode() );
				ps.setString(3, localityVO.getPinIode());
				ps.setLong(4, localityVO.getCityId());
				
			}

			public int getBatchSize() {
				return localityVOList.size();
			}
		});


		
	}
	



}
