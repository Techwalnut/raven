package com.raven.inc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.raven.inc.vo.FSRestaurantVO;

@Service
public interface IFSRestaurantDAO {

	void saveRestaurant(final ArrayList<FSRestaurantVO> fsRestaurantVOList);

	List<FSRestaurantVO> getRestaurantByLatLong(String latLong);

}
