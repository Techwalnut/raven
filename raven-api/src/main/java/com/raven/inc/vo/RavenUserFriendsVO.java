package com.raven.inc.vo;

import java.util.Date;

public class RavenUserFriendsVO {
	private long  id;
	private long ravenUsrId;
	private long ravenUsrFriendsId;
	private long ravenUsrFriendsFbId;
	private Date createdDate;
	private Date modifiedDate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getRavenUsrId() {
		return ravenUsrId;
	}
	public void setRavenUsrId(long ravenUsrId) {
		this.ravenUsrId = ravenUsrId;
	}
	public long getRavenUsrFriendsId() {
		return ravenUsrFriendsId;
	}
	public void setRavenUsrFriendsId(long ravenUsrFriendsId) {
		this.ravenUsrFriendsId = ravenUsrFriendsId;
	}
	public long getRavenUsrFriendsFbId() {
		return ravenUsrFriendsFbId;
	}
	public void setRavenUsrFriendsFbId(long ravenUsrFriendsFbId) {
		this.ravenUsrFriendsFbId = ravenUsrFriendsFbId;
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
		return "RavenUserFriendsVO [id=" + id + ", ravenUsrId=" + ravenUsrId
				+ ", ravenUsrFriendsId=" + ravenUsrFriendsId
				+ ", ravenUsrFriendsFbId=" + ravenUsrFriendsFbId
				+ ", createdDate=" + createdDate + ", modifiedDate="
				+ modifiedDate + "]";
	}
	
	

}
