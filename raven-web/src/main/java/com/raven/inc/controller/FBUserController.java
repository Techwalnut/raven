package com.raven.inc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.raven.inc.service.FBUserService;
import com.raven.inc.vo.RavenUserVO;

@Controller
@RequestMapping("/ravenusercontroller")
public class FBUserController {

	@Autowired
	FBUserService fbUserService;

	@RequestMapping(value = "/savefbuser", method = RequestMethod.POST)
	public @ResponseBody String saveFbUser(@RequestParam RavenUserVO ravenUserVO) {
		//System.out.println("********Controller" + id);
		fbUserService.saveFbser(ravenUserVO);
		return "success";
	}
	
	/*@RequestMapping(value = "/savefbusers", method=RequestMethod.POST)
    public @ResponseBody String saveFbUsers(@RequestParam String id) {
            
            return "success";                
    }*/

}
