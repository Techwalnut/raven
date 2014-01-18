package com.raven.inc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raven.inc.manager.FBUserManager;
import com.raven.inc.utils.ServiceResponse;
import com.raven.inc.vo.RavenUserVO;

@Service
public class FBUserService {
	
	@Autowired
	FBUserManager fbUserManager;
	
	public ServiceResponse<String> saveFbser(RavenUserVO ravenUserVO) {
		System.out.println("********Service");
		
		ServiceResponse<String> response = new ServiceResponse<String>();
		
		fbUserManager.saveFbUser(ravenUserVO);
		return response;
		
	}

}
