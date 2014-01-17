package com.raven.inc.dao;

import java.util.ArrayList;

import com.raven.inc.vo.FsMenuVO;
import com.raven.inc.vo.StateVO;

public interface IStateDAO {
	void saveState(final ArrayList<StateVO> stateVOList);

}
