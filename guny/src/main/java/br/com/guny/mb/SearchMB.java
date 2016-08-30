package br.com.guny.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean(name="searchMB")
public class SearchMB implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String searchValue;

	public String search(){		
		System.out.println("Search for "+searchValue);
		return null;
	}

	public String getSearchValue() {		
		return searchValue;
	}

	public void setSearchValue(String searchValue) {		
		this.searchValue = searchValue;
	}
}