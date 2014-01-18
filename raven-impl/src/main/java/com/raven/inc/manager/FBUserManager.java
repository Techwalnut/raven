package com.raven.inc.manager;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raven.inc.dao.IRavenFbDAO;
import com.raven.inc.dao.IRavenUserDAO;
import com.raven.inc.vo.FSRestaurantVO;
import com.raven.inc.vo.RavenFbVO;
import com.raven.inc.vo.RavenUserVO;
@Service
public class FBUserManager {
	@Autowired
	IRavenUserDAO ravenUserDAO;
	
	@Autowired
	IRavenFbDAO ravFbDAO;
	

	public RavenUserVO saveFbUser(RavenUserVO ravenUserVO) {
		
		System.out.println("********Manager");
	     int userCount=ravenUserDAO.isUserExist(ravenUserVO);
	     if(userCount==0)
	     {
	    	 ravenUserVO = ravenUserDAO.saveRavenUser(ravenUserVO);
	          
	         int fbUserCount=ravFbDAO.findUserInRavenFb(ravenUserVO);
	         if(fbUserCount==0)
	          {
	        	 ravFbDAO.saveRavenFb(ravenUserVO);  
	        	  
	          }
	          else
	          {
	        	  ArrayList<RavenFbVO> ravenFbVOList = new ArrayList<RavenFbVO>();
	        	  for (RavenFbVO ravenFbVO2 : ravenFbVOList) {
	        		  //ravenFbVOList.add(ravenFbVO);
				   }
	        	  //ravFbDAO.saveRavenFb(ravenFbVOList);
	          }
	          
	     }
	     return ravenUserVO;
	
	}
		
}


