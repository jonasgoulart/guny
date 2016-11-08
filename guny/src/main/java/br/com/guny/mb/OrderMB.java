package br.com.guny.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.tagcloud.TagCloudModel;

import br.com.guny.enums.PageEnum;
import br.com.guny.form.OrderForm;
import br.com.guny.services.CategoryService;

@ManagedBean
@ViewScoped
public class OrderMB {
	
	private TagCloudModel model;
	private OrderForm orderForm;
		
    public OrderMB() {   	
        model = new CategoryService().getTagCloudModelCategory(); 
        orderForm = new OrderForm();
    }
	
    public void loadDataOrder(){    	
    	System.out.println("Validar categoria selecionada: "+orderForm.getCategory());
    }
   
    public String sendOrder(){	
    	return PageEnum.MESSAGE.getValue();
    }
    
    public TagCloudModel getModel() {
        return model;
    }

	public OrderForm getOrderForm() {
		return orderForm;
	}

	public void setOrderForm(OrderForm orderForm) {
		this.orderForm = orderForm;
	}
}