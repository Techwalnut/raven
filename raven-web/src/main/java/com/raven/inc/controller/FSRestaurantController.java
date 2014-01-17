package com.raven.inc.controller;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.raven.inc.entity.Restaurant;
import com.raven.inc.service.FSRestaurantService;
import com.raven.inc.service.FourSquareVenueService;



@Controller

@RequestMapping("/restaurant")
public class FSRestaurantController {

	@Autowired
	FSRestaurantService fSRestaurantService;
	@Autowired
	FourSquareVenueService fourSquareVenueService;
	
	@RequestMapping(value="/getRestaurantsByLatLong", method = RequestMethod.GET)
	public @ResponseBody String getVenuesByLatLong(@RequestParam String latLong ) {
		
		System.out.println("inside getRestaurantByLatLong :: latLong = " + latLong );
		Restaurant restaurantByLatLong = fSRestaurantService.getRestaurantByLatLong(latLong);
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		try {
			String json = ow.writeValueAsString(restaurantByLatLong);
			System.out.println(json);
			return json;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	@RequestMapping(value="/findVenuByLatLong", method = RequestMethod.GET)
	public @ResponseBody String findVenuByLatLong(@RequestParam String latLong ) {
		
		System.out.println("inside getRestaurantByLatLong :: latLong = " + latLong );
		 fourSquareVenueService.findVenueByLatLong(latLong);
		return null;
	}
	
}
