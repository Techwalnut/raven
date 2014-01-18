package com.raven.inc.vo;

public class FbUserAccountData {
	
	private String photoUrl;
	private String facebookId;
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String getFacebookId() {
		return facebookId;
	}
	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}
	@Override
	public String toString() {
		return "FbUserAccountData [photoUrl=" + photoUrl + ", facebookId="
				+ facebookId + "]";
	}
	
	

}
