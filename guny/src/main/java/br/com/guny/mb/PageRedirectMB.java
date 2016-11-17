package br.com.guny.mb;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.model.tagcloud.TagCloudItem;

import br.com.guny.enums.PageEnum;

@ManagedBean
@ViewScoped
public class PageRedirectMB {
	
	public String openBuyPage(){
		return PageEnum.BUY_ORDER.getValue();
	}
	
	public String openSellPage(){
		return PageEnum.SALES_ORDER.getValue();
	}
	
	public void openOrderDescribePage(SelectEvent event) throws IOException{
		TagCloudItem item = (TagCloudItem) event.getObject();      
		FacesContext.getCurrentInstance().getExternalContext().redirect("buy-order/"+item.getLabel());
	}
	
	public void openOrdersDescribesPage(SelectEvent event) throws IOException{
		TagCloudItem item = (TagCloudItem) event.getObject();      
		FacesContext.getCurrentInstance().getExternalContext().redirect("sales-orders/"+item.getLabel());
	}
}
