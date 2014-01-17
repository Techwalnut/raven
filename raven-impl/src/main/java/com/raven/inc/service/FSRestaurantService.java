package com.raven.inc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raven.inc.entity.Restaurant;
import com.raven.inc.manager.FSRestaurantManager;
import com.raven.inc.vo.FSRestaurantVO;


@Service
public class FSRestaurantService {

	@Autowired
	FSRestaurantManager fSRestaurantManager;
	
	public Restaurant getRestaurantByLatLong(String latLong) {


		List<FSRestaurantVO> restaurantList = fSRestaurantManager.getRestaurantByLatLong(latLong);
		Restaurant restaurant = new Restaurant();
		if(restaurantList != null && restaurantList.size() != 0){
			restaurant.setIsSuccessful(true);
			restaurant.setResponseCode(100);
			restaurant.setMessage("Any Message will here");
			
			restaurant.setResult(restaurantList);
		}else{
			restaurant.setIsSuccessful(false);
			restaurant.setResponseCode(200);
			restaurant.setResult(null);
		}
		return restaurant;
		
	}

	
}
