package com.raven.inc.daoimpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.KeyHolder;


import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.raven.inc.dao.IRavenUserFriendsDAO;
import com.raven.inc.vo.FSRestaurantVO;
import com.raven.inc.vo.FsRestaurantMenuVO;
import com.raven.inc.vo.RavenUserFriendsVO;
import com.raven.inc.vo.RavenUserVO;

public class RavenUserFriendsDAO implements IRavenUserFriendsDAO {
	
	protected JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void saveRavenUserFriends(final ArrayList<RavenUserFriendsVO> ravenUserFriendsVOlist) {
		
final String sql="INSERT INTO raven_usr_friends("+
		"raven_usr_id  ,raven_usr_friends_id  ,raven_usr_friends_fb_id  ,created_date  ,modified_date) "+
		"VALUES (?,?,?,NOW(),NOW())";

      jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter(){ 
    	  @Override
			public void setValues(java.sql.PreparedStatement ps, int i)
					throws SQLException {
				RavenUserFriendsVO ravenUserFriendsVO = ravenUserFriendsVOlist.get(i);
				ps.setLong(1, ravenUserFriendsVO.getRavenUsrId());
				ps.setLong(2, ravenUserFriendsVO.getRavenUsrFriendsId());
				ps.setLong(3, ravenUserFriendsVO.getRavenUsrFriendsFbId());
				
			}
	 
			@Override
			public int getBatchSize() {
				return ravenUserFriendsVOlist.size();
			}
			
		});

		
	}

}
