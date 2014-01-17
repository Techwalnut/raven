package com.raven.inc.vo;

import java.util.Date;

public class RavenUserVO {
	
	private long id;
	private String ravenId;
	private String firstName;
	private String middleName;
	private String lastName; 
	private String cellNo;
	private String emailId;
	private Date dob;
	private String status;
	private Date createdDate;
	private Date modifiedDate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRavenId() {
		return ravenId;
	}
	public void setRavenId(String ravenId) {
		this.ravenId = ravenId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCellNo() {
		return cellNo;
	}
	public void setCellNo(String cellNo) {
		this.cellNo = cellNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
		return "RavenUserVO [id=" + id + ", ravenId=" + ravenId
				+ ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", cellNo=" + cellNo
				+ ", emailId=" + emailId + ", dob=" + dob + ", status="
				+ status + ", createdDate=" + createdDate + ", modifiedDate="
				+ modifiedDate + "]";
	}
	
	


}
