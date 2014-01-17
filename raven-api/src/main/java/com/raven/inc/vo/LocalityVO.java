package com.raven.inc.vo;

public class LocalityVO {
	
	private Long id;
	private String name;
	private String code;
	private String pinIode;
	private Long cityId;
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
	public String getPinIode() {
		return pinIode;
	}
	public void setPinIode(String pinIode) {
		this.pinIode = pinIode;
	}
	public Long getCityId() {
		return cityId;
	}
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	@Override
	public String toString() {
		return "LocalityVO [id=" + id + ", name=" + name + ", code=" + code
				+ ", pinIode=" + pinIode + ", cityId=" + cityId + "]";
	}
	
	


}
