package br.com.guny.domain;

public class Product {

	private String describe;
	
	private String shopUrl;
			
	private Shop shop;

	public Product(String describe, String shopUrl,  Shop shop) {
		super();
		this.describe = describe;
		this.shopUrl = shopUrl;
		this.shop = shop;
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

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}
}