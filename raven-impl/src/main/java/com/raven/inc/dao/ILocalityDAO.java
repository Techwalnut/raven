package com.raven.inc.dao;

import java.util.ArrayList;

import com.raven.inc.vo.LocalityVO;
import com.raven.inc.vo.RavenFbVO;

public interface ILocalityDAO {
	void saveLocality(final ArrayList<LocalityVO> localityVOList) ;

}
