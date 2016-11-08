package br.com.guny.domain;

public class User extends Domain{
	
	private String name;
	private String mail;

	public User() {
		super();
	}
	
	public User(String name, String mail) {
		super();
		this.name = name;
		this.mail = mail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
}