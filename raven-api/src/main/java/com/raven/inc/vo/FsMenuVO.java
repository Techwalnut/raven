package com.raven.inc.vo;

import com.google.appengine.repackaged.com.google.common.base.Flag.Date;


public class FsMenuVO {
	
	private Long id;
	private Long cuisineId;
	private String name;
	private Integer isVeg;
	private Integer isStarter;
	private Date createdDate;
	private Date modifiedDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCuisineId() {
		return cuisineId;
	}
	public void setCuisineId(Long cuisineId) {
		this.cuisineId = cuisineId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getIsVeg() {
		return isVeg;
	}
	public void setIsVeg(Integer isVeg) {
		this.isVeg = isVeg;
	}
	public Integer getIsStarter() {
		return isStarter;
	}
	public void setIsStarter(Integer isStarter) {
		this.isStarter = isStarter;
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
		return "FsMenuVO [id=" + id + ", cuisineId=" + cuisineId + ", name="
				+ name + ", isVeg=" + isVeg + ", isStarter=" + isStarter
				+ ", createdDate=" + createdDate + ", modifiedDate="
				+ modifiedDate + "]";
	}
	
	
	
	


}
