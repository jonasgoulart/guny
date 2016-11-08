package br.com.guny.enums;

public enum StatusEnum {

	ACTIVE("A"),
	INACTIVE("I");
	
	private String value;
	
	StatusEnum(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
