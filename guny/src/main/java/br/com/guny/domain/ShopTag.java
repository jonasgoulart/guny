package br.com.guny.domain;

public class ShopTag {

	private Shop shop;
	private String tagProductName;
	private String tagProductPrice;
	
	public ShopTag(Shop shop, String tagProductName, String tagProductPrice) {
		super();
		this.shop = shop;
		this.tagProductName = tagProductName;
		this.tagProductPrice = tagProductPrice;
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

	public String getTagProductPrice() {
		return tagProductPrice;
	}

	public void setTagProductPrice(String tagProductPrice) {
		this.tagProductPrice = tagProductPrice;
	}
}