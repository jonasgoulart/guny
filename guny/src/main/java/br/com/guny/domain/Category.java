package br.com.guny.domain;

public class Category {
	
	private String name;
		
	public Category() {
		super();
	}
	
	public Category(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}