package com.raven.inc.daoimpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import com.mysql.jdbc.Statement;
import com.raven.inc.dao.IRavenUserDAO;
import com.raven.inc.vo.RavenUserVO;

@Service
public class RavenUserDAO implements IRavenUserDAO {
	protected JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public RavenUserVO saveRavenUser(final RavenUserVO ravenUserVO) {
		System.out.println("********DAO");
		final String Sql = "INSERT INTO raven_usr("
				+ "raven_id  ,first_name  ,middle_name  ,last_name  ,cell_no  ,email_id  ,dob"
				+ " ,status  ,created_date  ,modified_date) VALUES (?,?,?,?,?,?,?,?,now(),now())";

		int key = 0;
		final String ravId = UUID.randomUUID().toString();
		
		try {
			KeyHolder keyHolder = new GeneratedKeyHolder();

			jdbcTemplate.update(new PreparedStatementCreator() {

				public PreparedStatement createPreparedStatement(
						Connection connection) throws SQLException {

					PreparedStatement ps = (PreparedStatement) connection
							.prepareStatement(Sql,
									Statement.RETURN_GENERATED_KEYS);
					
					ps.setString(1, ravId);
					ps.setString(2, ravenUserVO.getName().getFirstName());
					ps.setString(3, ravenUserVO.getName().getMiddleName());
					ps.setString(4, ravenUserVO.getName().getLastName());
					ps.setString(5, ravenUserVO.getCellNo());
					ps.setString(6, ravenUserVO.getEmailId());
					ps.setDate(7, ravenUserVO.getDob());
					ps.setString(8, ravenUserVO.getStatus());
					return ps;
				}
			}, keyHolder);

			key = keyHolder.getKey().intValue();
		} catch (Exception e) {
			System.out.println(e);
		}
		ravenUserVO.setRavenId(ravId);
		ravenUserVO.setId(key);
		return ravenUserVO;

		//

	}

	public int isUserExist(RavenUserVO ravenUserVO) {

		int userCount = jdbcTemplate
				.queryForInt("select count(*) from raven_usr join raven_fb on raven_usr.raven_id=raven_fb.raven_usr_id where raven_usr.raven_id="
						+ ravenUserVO.getRavenId() + " ");

		return userCount;

	}

}
