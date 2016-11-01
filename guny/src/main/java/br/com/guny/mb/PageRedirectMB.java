package br.com.guny.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class PageRedirectMB {
	
	public String openOrderPage(){
		return "pretty:order";
	}
}
