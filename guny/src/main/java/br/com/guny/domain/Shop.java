package br.com.guny.domain;

public class Shop {

	private String tagShopName;
	private String tagProductName;
	private String tagProductPrice;
	
	public Shop(String tagShopName, String tagProductName, String tagProductPrice) {
		super();
		this.tagShopName = tagShopName;
		this.tagProductName = tagProductName;
		this.tagProductPrice = tagProductPrice;
	}

	public String getTagShopName() {
		return tagShopName;
	}

	public void setTagShopName(String tagShopName) {
		this.tagShopName = tagShopName;
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