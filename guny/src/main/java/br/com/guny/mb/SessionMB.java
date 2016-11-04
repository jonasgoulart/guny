package br.com.guny.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.guny.domain.User;

@ManagedBean
@SessionScoped
public class SessionMB {
	
	private User user;
	
	public String loginWithGoogle(){
		user = new User("Jonas Goulart");
		return "pretty:order";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
