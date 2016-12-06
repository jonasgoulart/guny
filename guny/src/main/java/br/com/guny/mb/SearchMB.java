package br.com.guny.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.guny.domain.Product;
import br.com.guny.enums.PageEnum;
import br.com.guny.services.ProductService;

@ViewScoped
@ManagedBean(name="searchMB")
public class SearchMB implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String searchValue;
	
	private Product product;
	
	private boolean displaySearchResult;
	private boolean displaySearchNoResult;
	private boolean displaySearchErrorResult;
	
	public SearchMB(){
		this.displaySearchResult = false;
		this.displaySearchNoResult = false;
		this.displaySearchErrorResult = false;
	}

	public void search(){	
		
		try{
				this.product = new ProductService().getProduct(searchValue);	
				
				if(product == null){				
					this.displaySearchResult = false;
					this.displaySearchNoResult = true;
				}else{
					this.displaySearchResult = true;
					this.displaySearchNoResult = false;
				}
				
				this.displaySearchErrorResult = false;
								
		}catch(Exception ex){		
			this.displaySearchResult = false;
			this.displaySearchNoResult = false;
			this.displaySearchErrorResult = true;
			ex.printStackTrace();
		}
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public boolean isDisplaySearchResult() {
		return displaySearchResult;
	}

	public void setDisplaySearchResult(boolean displaySearchResult) {
		this.displaySearchResult = displaySearchResult;
	}

	public boolean isDisplaySearchNoResult() {
		return displaySearchNoResult;
	}

	public void setDisplaySearchNoResult(boolean displaySearchNoResult) {
		this.displaySearchNoResult = displaySearchNoResult;
	}

	public boolean isDisplaySearchErrorResult() {
		return displaySearchErrorResult;
	}

	public void setDisplaySearchErrorResult(boolean displaySearchErrorResult) {
		this.displaySearchErrorResult = displaySearchErrorResult;
	}
}