package br.com.guny.domain;

public class Shop {
	
	private String name;
	private String site;
	
	public Shop(String name, String site) {
		super();
		this.name = name;
		this.site = site;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}
}