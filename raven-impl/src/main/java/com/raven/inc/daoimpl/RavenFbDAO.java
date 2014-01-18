package com.raven.inc.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import com.mysql.jdbc.Statement;
import com.raven.inc.dao.IRavenFbDAO;
import com.raven.inc.vo.RavenFbVO;
import com.raven.inc.vo.RavenUserVO;

@Service
public class RavenFbDAO implements IRavenFbDAO {
	protected JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void saveRavenFb(final RavenUserVO ravenUserVO) {

		final String sql = "INSERT INTO raven_fb(first_name  ,middle_name  ,last_name  ,fb_id,email_id  ,dob ,"
				+ "cell_no  ,address,city  ,state  ,pin_code,raven_usr_id  ,created_date,"
				+ "modified_date) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,NOW(),NOW())";

		int key = 0;

		try {
			KeyHolder keyHolder = new GeneratedKeyHolder();

			jdbcTemplate.update(new PreparedStatementCreator() {

				@Override
				public PreparedStatement createPreparedStatement(
						Connection connection) throws SQLException {
					PreparedStatement ps = (PreparedStatement) connection
							.prepareStatement(sql,
									Statement.RETURN_GENERATED_KEYS);

					ps.setString(1, ravenUserVO.getName().getFirstName());
					ps.setString(2, ravenUserVO.getName().getMiddleName());
					ps.setString(3, ravenUserVO.getName().getLastName());
					ps.setString(4, ravenUserVO.getFacebookAccountOptions().getFacebookId());
					ps.setString(5, ravenUserVO.getEmailId());
					ps.setDate(6, ravenUserVO.getDob());
					ps.setString(7, ravenUserVO.getCellNo());
					ps.setString(8, ravenUserVO.getAddress().getLine1());
					ps.setString(9, ravenUserVO.getAddress().getCity());
					ps.setString(10, ravenUserVO.getAddress().getState());
					ps.setString(11, ravenUserVO.getAddress().getPostalCode());
					ps.setString(12, ravenUserVO.getRavenId());
					return ps;
				}
			}, keyHolder);

			key = keyHolder.getKey().intValue();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public int findUserInRavenFb(RavenUserVO ravenUserVO) {

		int fbUserCount = jdbcTemplate
				.queryForInt("select count(*) from raven_usr join raven_fb on "
						+ "raven_usr.raven_id=raven_fb.raven_usr_id where raven_fb.fb_id = '"
						+ ravenUserVO.getFacebookAccountOptions().getFacebookId()+"'");

		return fbUserCount;
	}

	public void updateRavenUserId(final RavenFbVO ravenFbVO) {
		jdbcTemplate.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(
					java.sql.Connection con) throws SQLException {
				PreparedStatement ps = con
						.prepareStatement("update raven_fb set raven_usr_id="
								+ ravenFbVO.getRavenUsrId() + " where fb_id='"
								+ ravenFbVO.getFbId() + "'");

				return ps;
			}
		});

	}

}
