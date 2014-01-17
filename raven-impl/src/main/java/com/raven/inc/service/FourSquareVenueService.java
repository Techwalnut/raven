package com.raven.inc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raven.inc.manager.FSRestaurantManager;

@Service
public class FourSquareVenueService {

	@Autowired
	FSRestaurantManager fSRestaurantManager;
	
	public void findVenueByLatLong(String latlong) {
	
		try {
			fSRestaurantManager.findVenueByLatLong(latlong);
			//fSRestaurantManager.findVenueByLatLong();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void findVenueByLocation(String locationName) {
		
		try {
			fSRestaurantManager.findVenueByLocation(locationName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
