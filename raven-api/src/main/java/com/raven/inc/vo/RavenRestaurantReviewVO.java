package com.raven.inc.vo;

import java.util.Date;

public class RavenRestaurantReviewVO {
	
	private Long id;
	private Long ravenRestaurantId;
	private Long ravenUsrId;
	private String review;
	private Double rating;
	private Date createdDate;
	private Date modifiedDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getRavenRestaurantId() {
		return ravenRestaurantId;
	}
	public void setRavenRestaurantId(Long ravenRestaurantId) {
		this.ravenRestaurantId = ravenRestaurantId;
	}
	public Long getRavenUsrId() {
		return ravenUsrId;
	}
	public void setRavenUsrId(Long ravenUsrId) {
		this.ravenUsrId = ravenUsrId;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
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
		return "RavenRestaurantReviewVO [id=" + id + ", ravenRestaurantId="
				+ ravenRestaurantId + ", ravenUsrId=" + ravenUsrId
				+ ", review=" + review + ", rating=" + rating
				+ ", createdDate=" + createdDate + ", modifiedDate="
				+ modifiedDate + "]";
	}
	
	


}
