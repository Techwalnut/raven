package com.raven.inc.dao;

import java.util.ArrayList;

import com.raven.inc.vo.RavenPaymentHistoryVO;

public interface IRavenPaymentHistoryDAO {
	
	void saveRavenPaymentHistory(final ArrayList<RavenPaymentHistoryVO> ravenPaymentHistoryVOList) ;

}
