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
	
	public String openOrderPage(){
		return PageEnum.ORDER.getValue();
	}
	
	public void openOrderDescribePage(SelectEvent event) throws IOException{
		TagCloudItem item = (TagCloudItem) event.getObject();      
		FacesContext.getCurrentInstance().getExternalContext().redirect("order/"+item.getLabel());
	}
}
