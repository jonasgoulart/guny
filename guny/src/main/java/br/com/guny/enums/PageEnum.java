package br.com.guny.enums;

public enum PageEnum {

	SEARCH("pretty:search"),
	BUY_ORDER("pretty:buy-order"),
	BUY_ORDER_DESCRIBE("pretty:buy-order-describe"),
	SALES_ORDERS("pretty:buy-orders"),
	SALES_ORDER("pretty:sales-order"),	
	MESSAGE("pretty:message");
	
	private String value;
	
	PageEnum(String page){
		this.value = page;
	}

	public String getValue() {
		return value;
	}
}
