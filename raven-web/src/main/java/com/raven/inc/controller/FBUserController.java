package com.raven.inc.controller;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.ObjectMapper;
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
@JsonIgnoreProperties(ignoreUnknown = true)
public class FBUserController {

	@Autowired
	FBUserService fbUserService;

	@RequestMapping(value = "/savefbuser", method = RequestMethod.POST)//, headers = {"Content-type=application/json"})
	public @ResponseBody String saveFbUser(@RequestParam String id) {
		System.out.println("********Controller " + id);
		
		try{
			ObjectMapper mapper = new ObjectMapper();
			RavenUserVO ravenUserVO = mapper.readValue(id, RavenUserVO.class);	
			System.out.println("ravenUserVO " + ravenUserVO.toString());
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//fbUserService.saveFbser(ravenUserVO);
		return "success";
	}
	
	/*@RequestMapping(value = "/savefbusers", method=RequestMethod.POST)
    public @ResponseBody String saveFbUsers(@RequestParam String id) {
            
            return "success";                
    }*/

}
