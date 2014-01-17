package com.raven.inc.vo;

import java.util.Date;

public class FsRestaurantPOSVO {
	
	
	private Long id;
	private Long fsRestaurantId;
	private Long ravenPosId;
	private String description;
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
	public Long getRavenPosId() {
		return ravenPosId;
	}
	public void setRavenPosId(Long ravenPosId) {
		this.ravenPosId = ravenPosId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
		return "FsRestaurantPOSVO [id=" + id + ", fsRestaurantId="
				+ fsRestaurantId + ", ravenPosId=" + ravenPosId
				+ ", description=" + description + ", createdDate="
				+ createdDate + ", modifiedDate=" + modifiedDate + "]";
	}
	
	
	


}
