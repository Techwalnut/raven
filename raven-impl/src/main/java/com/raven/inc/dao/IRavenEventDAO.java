/**
 * 
 */
package com.raven.inc.dao;

import java.util.ArrayList;

import com.raven.inc.vo.RavenEventVO;
import com.raven.inc.vo.StateVO;

/**
 * @author Ni3
 *
 */
public interface IRavenEventDAO {
	
	void saveRavenEvent(final ArrayList<RavenEventVO> rvEventVOList);

}
