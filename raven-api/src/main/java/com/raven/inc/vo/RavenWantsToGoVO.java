package com.raven.inc.vo;

import java.util.Date;

public class RavenWantsToGoVO {
	
	
	private Long id;
	private Long ravenRestaurantId;
	private Long ravenUsrId;
	private char status;
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
	
	
	
	
	
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "RavenWantsToGoVO [id=" + id + ", ravenRestaurantId="
				+ ravenRestaurantId + ", ravenUsrId=" + ravenUsrId
				+ ", createdDate=" + createdDate + ", modifiedDate="
				+ modifiedDate + "]";
	}
	
	


}
