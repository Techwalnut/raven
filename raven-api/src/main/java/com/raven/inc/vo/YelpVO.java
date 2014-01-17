package com.raven.inc.vo;

import java.util.Date;

public class YelpVO {
	
	private Long id;
	private Long  fsRestaurantId;
	private Long ravenRestaurantId;
	private String review;
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
	public Long getRavenRestaurantId() {
		return ravenRestaurantId;
	}
	public void setRavenRestaurantId(Long ravenRestaurantId) {
		this.ravenRestaurantId = ravenRestaurantId;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
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
		return "YelpVO [id=" + id + ", fsRestaurantId=" + fsRestaurantId
				+ ", ravenRestaurantId=" + ravenRestaurantId + ", review="
				+ review + ", createdDate=" + createdDate + ", modifiedDate="
				+ modifiedDate + "]";
	}
	
	


}
