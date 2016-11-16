package br.com.guny.domain;

public class Order extends Domain{

	private Category category;
	private String describe;
	private City city;
	private User userCreate;
	
	public Order() {
		super();
	}

	public Order(Category category, String describe,City city, User userCreate) {
		super();
		this.category = category;
		this.describe = describe;
		this.city = city;
		this.userCreate = userCreate;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public User getUserCreate() {
		return userCreate;
	}

	public void setUserCreate(User userCreate) {
		this.userCreate = userCreate;
	}
}