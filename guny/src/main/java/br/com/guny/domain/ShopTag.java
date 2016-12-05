package br.com.guny.domain;

public class ShopTag {

	private Shop shop;
	private String tagProductName;
	
	public ShopTag(Shop shop, String tagProductName) {
		super();
		this.shop = shop;
		this.tagProductName = tagProductName;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public String getTagProductName() {
		return tagProductName;
	}

	public void setTagProductName(String tagProductName) {
		this.tagProductName = tagProductName;
	}
}