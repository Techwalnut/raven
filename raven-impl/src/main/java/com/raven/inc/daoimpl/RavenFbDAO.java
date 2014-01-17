package com.raven.inc.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Service;

import com.mysql.jdbc.Connection;
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
	public void saveRavenFb(final ArrayList<RavenFbVO> ravenFbVOList) {
	
		
		final String sql="INSERT INTO raven_fb(first_name  ,middle_name  ,last_name  ,fb_id,email_id  ,dob ,"+ 
				"cell_no  ,address,locality  ,city  ,state  ,pin_code  ,other_info  ,raven_usr_id  ,created_date,"+
				   "modified_date) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,NOW(),NOW())";
				
				jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps, int i)
							throws SQLException {
						RavenFbVO ravenFbVO = ravenFbVOList.get(i);
						ps.setString(1, ravenFbVO.getFirstName());
						ps.setString(2, ravenFbVO.getMiddleName());
						ps.setString(3, ravenFbVO.getLastName());
						ps.setString(4, ravenFbVO.getFbId());
						ps.setString(5, ravenFbVO.getEmailId());
						//ps.setDate(6, ravenFbVO.getDob());///Confuse about Datatype(Setdate or set datetime)
						ps.setString(7, ravenFbVO.getCellNo());
						ps.setString(8, ravenFbVO.getAddress());
						ps.setString(9, ravenFbVO.getLocality());
						ps.setString(10, ravenFbVO.getCity());
						ps.setString(11, ravenFbVO.getState());
						ps.setString(12, ravenFbVO.getPinCode());
						ps.setString(13, ravenFbVO.getOtherInfo());
						ps.setString(14, ravenFbVO.getRavenUsrId());
						
						
						

					}

					@Override
					public int getBatchSize() {
						return ravenFbVOList.size();
					}
				});
		
	}
	
	public int findUserInRavenFb(RavenFbVO ravenFbVO) {
		
		int fbUserCount=jdbcTemplate.queryForInt("select count(*) from raven_usr join raven_fb on raven_usr.raven_id=raven_fb.raven_usr_id where raven_fb.fb_id="+ravenFbVO.getFbId()+" ");

        return fbUserCount;
	}
	
	
	public void updateRavenUserId(final RavenFbVO ravenFbVO)
	{
		jdbcTemplate.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(java.sql.Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement("update raven_fb set raven_usr_id="+ravenFbVO.getRavenUsrId()+" where fb_id="+ravenFbVO.getFbId()+"");
				
				return ps;
			}
		});
		
	}

	
}
