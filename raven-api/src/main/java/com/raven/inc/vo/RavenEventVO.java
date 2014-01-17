package com.raven.inc.vo;

import java.util.Date;

public class RavenEventVO {
	
	private Long id;
	private Long ravenRestaurantId;
	private char isCompleted;
	private Date eventDate;
	private Date createdDate;
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
	public char getIsCompleted() {
		return isCompleted;
	}
	public void setIsCompleted(char isCompleted) {
		this.isCompleted = isCompleted;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return "RavenEventVO [id=" + id + ", ravenRestaurantId="
				+ ravenRestaurantId + ", isCompleted=" + isCompleted
				+ ", eventDate=" + eventDate + ", createdDate=" + createdDate
				+ "]";
	}
	
	
	
	


}
