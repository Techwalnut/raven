package com.raven.inc.dao;

import java.util.ArrayList;

import com.raven.inc.vo.RavenRestaurantTimingVO;

public interface IRavenRestaurantTimingDAO {
	
	void saveRavenRestaurantTiming(final ArrayList<RavenRestaurantTimingVO> ravenRestaurantTimingVOList) ;

}
