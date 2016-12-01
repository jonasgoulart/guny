package br.com.guny.enums;

public enum UserAgentEnum {

	CHROME("Chrome/54.0.2840.99");
	
	private String value;
	
	UserAgentEnum(String page){
		this.value = page;
	}

	public String getValue() {
		return value;
	}
}
