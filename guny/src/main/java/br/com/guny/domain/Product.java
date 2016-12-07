package br.com.guny.domain;

public class Product {

	private String describe;
	
	private String shopUrl;
	
	private String imageUrl;
			
	private Shop shop;

	public Product(String describe, String shopUrl, String imageUrl, Shop shop) {
		super();
		this.describe = describe;
		this.shopUrl = shopUrl;
		this.imageUrl = imageUrl;
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
	
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}
}