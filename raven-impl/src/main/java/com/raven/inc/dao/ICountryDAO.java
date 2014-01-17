package com.raven.inc.dao;

import java.util.ArrayList;

import com.raven.inc.vo.CountryVO;

public interface ICountryDAO {
	void saveCountry(final ArrayList<CountryVO> countryVOList);

}
