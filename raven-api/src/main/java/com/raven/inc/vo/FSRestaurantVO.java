package com.raven.inc.vo;

import java.util.Date;

public class FSRestaurantVO {

	private Long id;
	private String restaurentId;
	private String name;
	private String address;
	private String crossStreet;
	private String city;
	private String state;
	private String country;
	private String postalCode;
	private Double lat;
	private Double longt;
	private String facebookId;
	private String emailId;
	private String phoneNumber;
	private String url;
	private Boolean verified;
	private String type;
	private String otherInfo;
	private Integer isRavenRestaurent;
	private Date createdDate;
	private Date modifiedDate;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRestaurentId() {
		return restaurentId;
	}
	public void setRestaurentId(String restaurentId) {
		this.restaurentId = restaurentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCrossStreet() {
		return crossStreet;
	}
	public void setCrossStreet(String crossStreet) {
		this.crossStreet = crossStreet;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}

	
	public Double getLongt() {
		return longt;
	}
	public void setLongt(Double longt) {
		this.longt = longt;
	}
	public String getFacebookId() {
		return facebookId;
	}
	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Boolean getVerified() {
		return verified;
	}
	public void setVerified(Boolean verified) {
		this.verified = verified;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}
	public Integer getIsRavenRestaurent() {
		return isRavenRestaurent;
	}
	public void setIsRavenRestaurent(Integer isRavenRestaurent) {
		this.isRavenRestaurent = isRavenRestaurent;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	@Override
	public String toString() {
		return "FSRestaurantVO [id=" + id + ", restaurentId=" + restaurentId
				+ ", name=" + name + ", address=" + address + ", crossStreet="
				+ crossStreet + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", postalCode=" + postalCode
				+ ", lat=" + lat + ", longt=" + longt + ", facebookId="
				+ facebookId + ", emailId=" + emailId + ", phoneNumber="
				+ phoneNumber + ", url=" + url + ", verified=" + verified
				+ ", type=" + type + ", otherInfo=" + otherInfo
				+ ", isRavenRestaurent=" + isRavenRestaurent + ", createdDate="
				+ createdDate + ", modifiedDate=" + modifiedDate + "]";
	}


	
	
	
	
}
