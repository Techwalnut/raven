package com.raven.inc.dao;

import org.springframework.stereotype.Service;

import com.raven.inc.vo.RavenUserVO;

@Service
public interface IRavenUserDAO {

	RavenUserVO saveRavenUser(final RavenUserVO ravenUserVO);

	int isUserExist(final RavenUserVO ravenUserVO);

}
