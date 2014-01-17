package com.raven.inc.utils;

import com.raven.inc.vo.FSRestaurantVO;

import fi.foyt.foursquare.api.entities.CompactVenue;

public class Util {

	public static FSRestaurantVO convertVenueToFsRestaurant(CompactVenue venue) {

		FSRestaurantVO fsRestaurantVO = new FSRestaurantVO();
		// here u need to get values from venue and set values in fsrestaurentVO.
		// am doing 2 sample lines. u need to complete it for all fsRestaurantVO fields.
		fsRestaurantVO.setRestaurentId(venue.getId());
		fsRestaurantVO.setName(venue.getName());
		fsRestaurantVO.setAddress(venue.getLocation().getAddress());
		fsRestaurantVO.setCity(venue.getLocation().getCity());
		fsRestaurantVO.setCountry(venue.getLocation().getCountry());
		fsRestaurantVO.setEmailId(venue.getContact().getEmail());
		fsRestaurantVO.setFacebookId(venue.getContact().getFacebook());
		fsRestaurantVO.setIsRavenRestaurent(0);
		fsRestaurantVO.setLat(venue.getLocation().getLat());
		fsRestaurantVO.setLongt(venue.getLocation().getLng());
		fsRestaurantVO.setOtherInfo("No Entry");
		fsRestaurantVO.setPhoneNumber(venue.getContact().getPhone());
		fsRestaurantVO.setPostalCode(venue.getLocation().getPostalCode());
		fsRestaurantVO.setState(venue.getLocation().getState());
		fsRestaurantVO.setType("Not specified");
		fsRestaurantVO.setUrl(venue.getUrl());
		fsRestaurantVO.setVerified(venue.getVerified());
		
		return fsRestaurantVO;


	}

}
