package br.com.guny.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.guny.enums.PageEnum;

@RequestScoped
@ManagedBean(name="searchMB")
public class SearchMB implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String searchValue;

	public String search(){				
		return PageEnum.BUY_ORDER.getValue();
	}
	
	public String send(){				
		return PageEnum.MESSAGE.getValue();
	}
	
	public String getSearchValue() {		
		return searchValue;
	}

	public void setSearchValue(String searchValue) {		
		this.searchValue = searchValue;
	}
}