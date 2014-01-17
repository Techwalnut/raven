package com.raven.inc.entity;

import java.util.List;

import com.raven.inc.utils.ServiceResponse;
import com.raven.inc.vo.FSRestaurantVO;

public class Restaurant extends ServiceResponse {

	private List<FSRestaurantVO> result;

	public List<FSRestaurantVO> getResult() {
		return result;
	}

	public void setResult(List<FSRestaurantVO> result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Restaurant [result=" + result + "]";
	}
	
	
	
}
