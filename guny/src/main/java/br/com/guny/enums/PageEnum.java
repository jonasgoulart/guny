package br.com.guny.enums;

public enum PageEnum {

	SEARCH("search"),
	ORDER_INFO("order-info"),
	ORDER_MESSAGE("order-message");
	
	private String page;
	
	PageEnum(String page){
		this.page = page;
	}

	public String getPage() {
		return page;
	}
}
