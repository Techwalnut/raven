package com.raven.inc.vo;

public class StateVO {
	
	private Long id;
	private String name;
	private String code;
	private Long countryId;
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
	public Long getCountryId() {
		return countryId;
	}
	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}
	@Override
	public String toString() {
		return "StateVO [id=" + id + ", name=" + name + ", code=" + code
				+ ", countryId=" + countryId + "]";
	}
	
	

}
