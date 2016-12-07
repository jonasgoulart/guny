package br.com.guny.domain;

public class ShopTag {

	private Shop shop;
	private String tagProductName;
	private String tagProductImage;
	
	public ShopTag(Shop shop, String tagProductName, String tagProductImage) {
		super();
		this.shop = shop;
		this.tagProductName = tagProductName;
		this.tagProductImage = tagProductImage;
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

	public String getTagProductImage() {
		return tagProductImage;
	}

	public void setTagProductImage(String tagProductImage) {
		this.tagProductImage = tagProductImage;
	}
}