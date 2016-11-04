package br.com.guny.form;

public class OrderForm {
	
	private String category;
	private String describe;
	
	public OrderForm() {
		super();
	}

	public OrderForm(String category, String describe) {
		super();
		this.category = category;
		this.describe = describe;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}
}