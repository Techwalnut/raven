package com.raven.inc.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.raven.inc.vo.RavenFbVO;
import com.raven.inc.vo.RavenUserVO;

@Service
public interface IRavenFbDAO {

	void saveRavenFb(RavenUserVO ravenUserVO);

	int findUserInRavenFb(RavenUserVO ravenUserVO);

	void updateRavenUserId(final RavenFbVO ravenFbVO);

	
}
