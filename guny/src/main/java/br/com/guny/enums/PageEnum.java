package br.com.guny.enums;

public enum PageEnum {

	SEARCH("pretty:search"),
	ORDER("pretty:order"),
	MESSAGE("pretty:message");
	
	private String value;
	
	PageEnum(String page){
		this.value = page;
	}

	public String getValue() {
		return value;
	}
}
