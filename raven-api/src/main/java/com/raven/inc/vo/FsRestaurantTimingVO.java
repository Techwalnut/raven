package com.raven.inc.vo;

import java.util.Date;

public class FsRestaurantTimingVO {
	
	private Long id;
	private Long fsRestaurantId;
	private String weekDay;
	private Date  openTime;
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
		return "FsRestaurantTimingVO [id=" + id + ", fsRestaurantId="
				+ fsRestaurantId + ", weekDay=" + weekDay + ", openTime="
				+ openTime + ", createdDate=" + createdDate + ", modifiedDate="
				+ modifiedDate + "]";
	}
	
	
	
	


}
