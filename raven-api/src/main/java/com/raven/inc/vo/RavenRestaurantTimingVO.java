package com.raven.inc.vo;

import java.util.Date;

public class RavenRestaurantTimingVO {
	
	private Long id;
	private Long ravenRestaurantId;
	private String weekDay;
	private Date openTime;
	private Date closeTime;
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
	public String getWeekDay() {
		return weekDay;
	}
	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
	}
	public Date getOpenTime() {
		return openTime;
	}
	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}
	public Date getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(Date closeTime) {
		this.closeTime = closeTime;
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
		return "RavenRestaurantTimingVO [id=" + id + ", ravenRestaurantId="
				+ ravenRestaurantId + ", weekDay=" + weekDay + ", openTime="
				+ openTime + ", closeTime=" + closeTime + ", createdDate="
				+ createdDate + ", modifiedDate=" + modifiedDate + "]";
	}
	
	


}
