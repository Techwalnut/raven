package com.raven.inc.dao;

import java.util.ArrayList;

import com.raven.inc.vo.RavenEventHistoryVO;

public interface IRavenEventHistoryDAO {
	
	void saveRavenEventHistory(final ArrayList<RavenEventHistoryVO> ravenEventHistoryVOList);

}
