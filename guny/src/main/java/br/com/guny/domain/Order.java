package br.com.guny.domain;

public class Order extends Domain{

	private String describe;
	private User userCreate;
	
	public Order() {
		super();
	}

	public Order(String describe, User userCreate) {
		super();
		this.describe = describe;
		this.userCreate = userCreate;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public User getUserCreate() {
		return userCreate;
	}

	public void setUserCreate(User userCreate) {
		this.userCreate = userCreate;
	}
}