package com.raven.inc.vo;

public class CountryVO {
	
	private Long id;
	private String name;
	private String code;
    private String stdCode;
   
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	 
		public String getStdCode() {
			return stdCode;
		}
		public void setStdCode(String stdCode) {
			this.stdCode = stdCode;
		}
	
	@Override
	public String toString() {
		return "CountryVO [id=" + id + ", name=" + name + ", code=" + code
				+ ", countryCode=" + stdCode + "]";
	}
    
    
}
