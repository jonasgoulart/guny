package br.com.guny.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.guny.domain.Product;
import br.com.guny.enums.PageEnum;
import br.com.guny.services.ProductService;

@SessionScoped
@ManagedBean(name="searchMB")
public class SearchMB implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String searchValue;
	
	private Product product;

	public String search(){			
		
		product = new ProductService().getProduct(searchValue);
		
		System.out.println("Produto: "+product.getDescribe());
		System.out.println("Onde: "+ product.getShop().getName());
		
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}