package com.raven.inc.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.raven.inc.dao.IRavenPaymentHistoryDAO;
import com.raven.inc.vo.RavenEventVO;
import com.raven.inc.vo.RavenPaymentHistoryVO;

public class RavenPaymentHistory implements IRavenPaymentHistoryDAO {
	
	protected JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void saveRavenPaymentHistory(final ArrayList<RavenPaymentHistoryVO> ravenPaymentHistoryVOList) {
		
		
final String sql="INSERT INTO raven_payment_history( raven_events_id  ,raven_usr_id  ,payment  ,tip) Values(?,?,?,?)";
		
		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
			public void setValues(PreparedStatement ps, int i)
					throws SQLException {
				RavenPaymentHistoryVO ravenPaymentHistoryVO = ravenPaymentHistoryVOList.get(i);
				ps.setLong(1, ravenPaymentHistoryVO.getRavenEventsId());
				ps.setLong(2, ravenPaymentHistoryVO.getRavenUsrId());
				ps.setDouble(3, ravenPaymentHistoryVO.getPayment());
				ps.setDouble(4, ravenPaymentHistoryVO.getTip());
				
			}

			@Override
			public int getBatchSize() {
				return ravenPaymentHistoryVOList.size();
			}
		});

		
	}


}
