package com.raven.inc.dao;

import java.util.ArrayList;

import com.raven.inc.vo.YelpVO;

public interface IYelpDAO {
	void saveYelp(final ArrayList<YelpVO> yelpVOList);

}
