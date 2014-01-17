package com.raven.inc.vo;

import java.util.Date;

public class RavenEventHistoryVO {
	private Long id;
	private Long ravenEventsId;
	private Long ravenUsrId;
	private Long ravenRestaurantMenu;
	private Integer quantity;
	private Double unitPrice;
	private Date createdDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getRavenEventsId() {
		return ravenEventsId;
	}
	public void setRavenEventsId(Long ravenEventsId) {
		this.ravenEventsId = ravenEventsId;
	}
	public Long getRavenUsrId() {
		return ravenUsrId;
	}
	public void setRavenUsrId(Long ravenUsrId) {
		this.ravenUsrId = ravenUsrId;
	}
	public Long getRavenRestaurantMenu() {
		return ravenRestaurantMenu;
	}
	public void setRavenRestaurantMenu(Long ravenRestaurantMenu) {
		this.ravenRestaurantMenu = ravenRestaurantMenu;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return "RavenEventHistoryVO [id=" + id + ", ravenEventsId="
				+ ravenEventsId + ", ravenUsrId=" + ravenUsrId
				+ ", ravenRestaurantMenu=" + ravenRestaurantMenu
				+ ", quantity=" + quantity + ", unitPrice=" + unitPrice
				+ ", createdDate=" + createdDate + "]";
	}
	
	
	


}
