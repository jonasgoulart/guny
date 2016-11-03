package br.com.guny.mb;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.model.tagcloud.TagCloudItem;

@ManagedBean
@ViewScoped
public class PageRedirectMB {
	
	public String openOrderPage(){
		return "pretty:order";
	}
	
	public void openOrderDescribePage(SelectEvent event) throws IOException{
		TagCloudItem item = (TagCloudItem) event.getObject();      
		FacesContext.getCurrentInstance().getExternalContext().redirect("order/"+item.getLabel());
	}
}
