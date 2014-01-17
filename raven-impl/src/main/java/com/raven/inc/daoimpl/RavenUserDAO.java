package com.raven.inc.daoimpl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import com.google.cloud.sql.jdbc.PreparedStatement;
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
    final String Sql = "INSERT INTO raven_usr(raven_id ,first_name ,middle_name ,last_name ,cell_no ,"+
		"email_id ,dob ,status ,created_date ,modified_date) VALUES (?,?,?,?,?,?,?,?,NOW().NOW())";
			
			 int key = 0;

				try {
					KeyHolder keyHolder = new GeneratedKeyHolder();

					jdbcTemplate.update(new PreparedStatementCreator() {

						public PreparedStatement createPreparedStatement(
								Connection connection) throws SQLException {
							
							PreparedStatement ps = (PreparedStatement) connection.prepareStatement(
									Sql , Statement.RETURN_GENERATED_KEYS);
							
							ps.setString(1,ravenUserVO.getRavenId());
							ps.setString(2, ravenUserVO.getFirstName());
							ps.setString(3, ravenUserVO.getMiddleName());
							ps.setString(4, ravenUserVO.getLastName());
							ps.setString(5, ravenUserVO.getCellNo());
							ps.setString(6, ravenUserVO.getEmailId());
							//ps.setString(7, ravenUserVO.getDob());///  date
							ps.setString(8, ravenUserVO.getStatus());
				
							return ps;
						}
					}, keyHolder);

					key = keyHolder.getKey().intValue();
				} catch (Exception e) {
					System.out.println(e);
				}
				ravenUserVO.setRavenId(ravenUserVO.getRavenId());
				ravenUserVO.setId(key);
				return ravenUserVO;
		
		//
		
	}
	 
     public int isUserExist(RavenUserVO ravenUserVO) {
		
			int userCount=jdbcTemplate.queryForInt("select count(*) from raven_usr join raven_fb on raven_usr.raven_id=raven_fb.raven_usr_id where raven_usr.raven_id="+ravenUserVO.getRavenId()+" ");
	
	        return userCount;
		
	}

}
