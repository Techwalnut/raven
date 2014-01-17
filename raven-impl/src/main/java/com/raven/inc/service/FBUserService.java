package com.raven.inc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raven.inc.manager.FBUserManager;
import com.raven.inc.vo.RavenUserVO;

@Service
public class FBUserService {
	
	@Autowired
	FBUserManager fbUserManager;
	
	public RavenUserVO saveFbser(RavenUserVO ravenUserVO) {
		System.out.println("********Service");
		fbUserManager.saveFbUser(ravenUserVO);
		return ravenUserVO;
		
	}

}
