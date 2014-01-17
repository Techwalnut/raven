package com.raven.inc.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.raven.inc.vo.RavenFbVO;
@Service
public interface IRavenFbDAO {
	void saveRavenFb(final ArrayList<RavenFbVO> ravenFbVOList) ;
	int findUserInRavenFb(RavenFbVO ravenFbVO);
	void updateRavenUserId(final RavenFbVO ravenFbVO);

}
