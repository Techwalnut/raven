package com.raven.inc.vo;

import com.google.appengine.repackaged.com.google.common.base.Flag.Date;

public class FsRestaurantMenuVO {
	private Long id;
	private Long fsRestaurantId;
	private Long fsMenuId;
	private Double price;
	private Date createdDate;
	private Date modifiedDate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getFsRestaurantId() {
		return fsRestaurantId;
	}
	public void setFsRestaurantId(Long fsRestaurantId) {
		this.fsRestaurantId = fsRestaurantId;
	}
	public Long getFsMenuId() {
		return fsMenuId;
	}
	public void setFsMenuId(Long fsMenuId) {
		this.fsMenuId = fsMenuId;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
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
		return "FsRestaurantMenuVO [id=" + id + ", fsRestaurantId="
				+ fsRestaurantId + ", fsMenuId=" + fsMenuId + ", price="
				+ price + ", createdDate=" + createdDate + ", modifiedDate="
				+ modifiedDate + "]";
	}
	
	
	
	


}
