package br.com.guny.domain;

public class Product {

	private String describe;
	
	private String shopUrl;
	
	private Double price;

	public Product(String describe, String shopUrl, Double price) {
		super();
		this.describe = describe;
		this.shopUrl = shopUrl;
		this.price = price;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getShopUrl() {
		return shopUrl;
	}

	public void setShopUrl(String shopUrl) {
		this.shopUrl = shopUrl;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}