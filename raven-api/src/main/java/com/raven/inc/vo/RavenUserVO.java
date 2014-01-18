package com.raven.inc.vo;

import java.util.Date;

public class RavenUserVO {

	private long id;
	private String ravenId;
	private FbUserName name;
	private FbUserAddress address;
	private FbUserAccountData facebookAccountOptions;
	private String cellNo;
	private String emailId;
	private Date dob;
	private String status;
	private Date createdDate;
	private Date modifiedDate;
	// private List<RavenFbVO> fbVOs;
	private String accountType;

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

	/*
	 * public void setFbVOs(List<RavenFbVO> fbVOs) { this.fbVOs = fbVOs; }
	 * public List<RavenFbVO> getFbVOs() { return fbVOs; }
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public FbUserName getName() {
		return name;
	}

	public void setName(FbUserName name) {
		this.name = name;
	}
	
	public void setAddress(FbUserAddress address) {
		this.address = address;
	}

	public FbUserAddress getAddress() {
		return address;
	}

	public void setFacebookAccountOptions(FbUserAccountData facebookAccountOptions) {
		this.facebookAccountOptions = facebookAccountOptions;
	}

	public FbUserAccountData getFacebookAccountOptions() {
		return facebookAccountOptions;
	}


	@Override
	public String toString() {
		return "RavenUserVO [id=" + id + ", ravenId=" + ravenId + ", name="
				+ name + ", address=" + address + ", facebookAccountOptions="
				+ facebookAccountOptions + ", cellNo=" + cellNo + ", emailId="
				+ emailId + ", dob=" + dob + ", status=" + status
				+ ", createdDate=" + createdDate + ", modifiedDate="
				+ modifiedDate + ", accountType=" + accountType + "]";
	}

	
}
