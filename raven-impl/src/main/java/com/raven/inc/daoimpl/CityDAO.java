package com.raven.inc.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.raven.inc.dao.ICityDAO;
import com.raven.inc.vo.CityVO;
import com.raven.inc.vo.YelpVO;

public class CityDAO implements ICityDAO {
	protected JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void saveCity(final ArrayList<CityVO> cityVOList) {
		final String sql="INSERT INTO city(name  ,code  ,state_code) VALUES (?,?,?)";
		
		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
			public void setValues(PreparedStatement ps, int i)
					throws SQLException {
				CityVO cityVO = cityVOList.get(i);
				ps.setString(1, cityVO.getName());
				ps.setString(2, cityVO.getCode());
				ps.setLong(3,cityVO.getStateId());
				
			
			}

			public int getBatchSize() {
				return cityVOList.size();
			}
		});

		
	}

}
