package com.raven.inc.dao;

import java.util.ArrayList;

import com.raven.inc.vo.CityVO;


public interface ICityDAO {
	
	void saveCity(final ArrayList<CityVO> cityVOList);

}
