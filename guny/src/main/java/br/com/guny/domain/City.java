package br.com.guny.domain;

public class City {
	
	private String name;
	private String initialState;
	
	public City() {
		super();
	}

	public City(String name, String initialState) {
		super();
		this.name = name;
		this.initialState = initialState;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInitialState() {
		return initialState;
	}

	public void setInitialState(String initialState) {
		this.initialState = initialState;
	}
}
