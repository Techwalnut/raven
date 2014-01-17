package com.raven.inc.manager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raven.inc.dao.IFSRestaurantDAO;
import com.raven.inc.utils.Util;
import com.raven.inc.vo.FSRestaurantVO;

import fi.foyt.foursquare.api.FoursquareApi;
import fi.foyt.foursquare.api.FoursquareApiException;
import fi.foyt.foursquare.api.Result;
import fi.foyt.foursquare.api.entities.CompactVenue;
import fi.foyt.foursquare.api.entities.VenuesSearchResult;

@Service
public class FSRestaurantManager {
	
	@Autowired
	IFSRestaurantDAO fSRestaurantDAO;
	
	
	public void findVenueByLatLong(String latlong) throws FoursquareApiException {
		  //String latlong=null;
		  FoursquareApi foursquareApi = new FoursquareApi(
		    		"FSJHBWSBDB2SQ3SC1U5ZNJB2ORATKKJ0MRKKMRWVY5QRNCNA",
		    		"4QSYY3IDVY3DBIYQ0QVLESFCX0AUX5F1TFCJXIAIERP11QFO", 
		    		"www.techwalnut.com"
		    		);
		  
		  
		Result<VenuesSearchResult> result = foursquareApi.venuesSearch(latlong, null, null, null, null, null, null, null, null, null, null);
	    
	    if (result.getMeta().getCode() == 200) {
	    	
	    	ArrayList<FSRestaurantVO> fsRestaurantVOList = new ArrayList<FSRestaurantVO>();
	      for (CompactVenue venue : result.getResult().getVenues()) {
	    	  System.out.println("venue find :: "+venue.getName()+"  Location ::"+venue.getLocation());
	    	  FSRestaurantVO fsRestaurantVO = Util.convertVenueToFsRestaurant(venue);
	    	  fsRestaurantVOList.add(fsRestaurantVO);
	    	 
	    	  
	      }
	      fSRestaurantDAO.saveRestaurant(fsRestaurantVOList);
	    } else {
	      System.out.println("Error occured: ");
	      System.out.println("  code: " + result.getMeta().getCode());
	      System.out.println("  type: " + result.getMeta().getErrorType());
	      System.out.println("  detail: " + result.getMeta().getErrorDetail()); 
	    }
	}
	
	public void findVenueByLocation(String locationName) throws Exception {
		
		  FoursquareApi foursquareApi = new FoursquareApi(
		    		"FSJHBWSBDB2SQ3SC1U5ZNJB2ORATKKJ0MRKKMRWVY5QRNCNA",
		    		"4QSYY3IDVY3DBIYQ0QVLESFCX0AUX5F1TFCJXIAIERP11QFO", 
		    		"www.techwalnut.com"
		    		);
		  
		Result<VenuesSearchResult> result = foursquareApi.venuesSearch(locationName, null, null, null, null, null, null, null);
	    
	    if (result.getMeta().getCode() == 200) {
	    	ArrayList<FSRestaurantVO> fsRestaurantVOList = new ArrayList<FSRestaurantVO>();
		      for (CompactVenue venue : result.getResult().getVenues()) {
		    	  System.out.println("venue find :: "+venue.getName()+"  Location ::"+venue.getLocation());
		    	  FSRestaurantVO fsRestaurantVO = Util.convertVenueToFsRestaurant(venue);
		    	  fsRestaurantVOList.add(fsRestaurantVO);
		    	  
		      	 
		    }
		      fSRestaurantDAO.saveRestaurant(fsRestaurantVOList);
	    } else {
	      System.out.println("Error occured: ");
	      System.out.println("  code: " + result.getMeta().getCode());
	      System.out.println("  type: " + result.getMeta().getErrorType());
	      System.out.println("  detail: " + result.getMeta().getErrorDetail()); 
	    }	
	    
	}

	public List<FSRestaurantVO> getRestaurantByLatLong(String latLong) {

		List<FSRestaurantVO> restaurantList = fSRestaurantDAO.getRestaurantByLatLong(latLong);
		return restaurantList;
		
	}
	///////////////////////
	
	
	
	
	
	
}