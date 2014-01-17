package com.raven.inc.dao;

import java.util.ArrayList;

import com.raven.inc.vo.RavenFbVO;

public interface IRavenFbDAO {
	void saveRavenFb(final ArrayList<RavenFbVO> ravenFbVOList) ;
	int findUserInRavenFb(RavenFbVO ravenFbVO);
	void updateRavenUserId(final RavenFbVO ravenFbVO);

}
