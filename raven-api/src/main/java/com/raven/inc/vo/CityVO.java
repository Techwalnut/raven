package com.raven.inc.vo;

public class CityVO {
	
	private Long id;
	private String name;
	private String code;
	private Long stateId;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Long getStateId() {
		return stateId;
	}
	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}
	@Override
	public String toString() {
		return "CityVO [id=" + id + ", name=" + name + ", code=" + code
				+ ", stateId=" + stateId + "]";
	}
	
	
	



}
