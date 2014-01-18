package com.raven.inc.vo;

public class FbUserAddress {
	private String line1;
	private String city;
	private String state;
	private String postalCode;
	private String country;

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "FbUserAddress [line1=" + line1 + ", city=" + city + ", state="
				+ state + ", postalCode=" + postalCode + ", country=" + country
				+ "]";
	}

}
