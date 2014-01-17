package com.raven.inc.vo;

public class RavenPaymentHistoryVO {
	
	private Long id	;	
	private Long ravenEventsId;		
	private Long ravenUsrId;	
	private Double payment;		
	private Double tip;
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
	public Double getPayment() {
		return payment;
	}
	public void setPayment(Double payment) {
		this.payment = payment;
	}
	public Double getTip() {
		return tip;
	}
	public void setTip(Double tip) {
		this.tip = tip;
	}
	@Override
	public String toString() {
		return "RavenPaymentHistory [id=" + id + ", ravenEventsId="
				+ ravenEventsId + ", ravenUsrId=" + ravenUsrId + ", payment="
				+ payment + ", tip=" + tip + "]";
	}	
	
	

}
