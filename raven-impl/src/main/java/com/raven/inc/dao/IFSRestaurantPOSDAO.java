package com.raven.inc.dao;

import java.util.ArrayList;

import com.raven.inc.vo.FsRestaurantPOSVO;

public interface IFSRestaurantPOSDAO {
	void saveFsRestaurantPos(final ArrayList<FsRestaurantPOSVO> fsRestaurantPOSVOList);

}
