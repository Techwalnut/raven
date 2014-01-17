package com.raven.inc.dao;

import java.util.ArrayList;
import org.springframework.stereotype.Service;


import com.raven.inc.vo.FsRestaurantMenuVO;
@Service
public interface IFSRestaurantMenuDAO {
	void saveRestaurantMenu(final ArrayList<FsRestaurantMenuVO> fsRestaurantMenuVOList) ;

}
