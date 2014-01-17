package com.raven.inc.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.raven.inc.dao.IStateDAO;
import com.raven.inc.vo.StateVO;
import com.raven.inc.vo.YelpVO;

public class StateDAO implements IStateDAO{
	
	protected JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void saveState(final ArrayList<StateVO> stateVOList) {
		
		final String sql="INSERT INTO state(name  ,code ,country_code) VALUES (?,?,?)";
		
		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
			public void setValues(PreparedStatement ps, int i)
					throws SQLException {
				StateVO stateVO = stateVOList.get(i);
				ps.setString(1, stateVO.getName());
				ps.setString(2, stateVO.getCode());
				ps.setLong(3,stateVO.getCountryId() );
				
			
			}

			@Override
			public int getBatchSize() {
				return stateVOList.size();
			}
		});
		
	}

}
