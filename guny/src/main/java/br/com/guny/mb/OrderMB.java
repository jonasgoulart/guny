package br.com.guny.mb;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class OrderMB {
	
	private String productName;
	
	public List<String> filterProductName(String name) {
        List<String> results = new ArrayList<String>();
        for(int i = 0; i < 10; i++) {
            results.add(name + i);
        }
         
        return results;
    }

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}