package com.raven.inc.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.raven.inc.dao.ICountryDAO;
import com.raven.inc.vo.CountryVO;

public class CountryDAO implements ICountryDAO {

	protected JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void saveCountry(final ArrayList<CountryVO> countryVOList) {
		final String sql = "INSERT INTO country(name  ,code  ,std_code) VALUES (?,?,?,?)";

		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
			public void setValues(PreparedStatement ps, int i)
					throws SQLException {
				CountryVO countryVO = countryVOList.get(i);
				ps.setString(1, countryVO.getName());
				ps.setString(2, countryVO.getCode());
				ps.setString(3, countryVO.getStdCode());

			}

			public int getBatchSize() {
				return countryVOList.size();
			}
		});

	}

}
