package com.raven.inc.dao;

import java.util.ArrayList;

import com.raven.inc.vo.RavenEventHistoryVO;
import com.raven.inc.vo.RavenFavoriteVO;

public interface IRavenFavoriteDAO {

	void saveRavenFavorite(final ArrayList<RavenFavoriteVO> ravenFavoriteVOList);

}
