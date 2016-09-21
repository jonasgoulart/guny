package br.com.guny.enums;

public enum PageEnum {

	SEARCH("pretty:search"),
	ORDER("pretty:order"),
	MESSAGE("pretty:message");
	
	private String page;
	
	PageEnum(String page){
		this.page = page;
	}

	public String getPage() {
		return page;
	}
}
