package br.com.guny.mb;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.tagcloud.TagCloudModel;

import br.com.guny.domain.Category;
import br.com.guny.domain.City;
import br.com.guny.domain.Order;
import br.com.guny.domain.User;
import br.com.guny.enums.PageEnum;
import br.com.guny.form.OrderForm;
import br.com.guny.services.CategoryService;

@ManagedBean
@ViewScoped
public class OrderMB {
	
	private TagCloudModel model;
	private OrderForm orderForm;
	private List<Order> orders;
		
    public OrderMB() {   	
        model = new CategoryService().getTagCloudModelCategory(); 
        orderForm = new OrderForm();
    }
	
    public void loadDataOrder(){    	
    	System.out.println("Validar categoria selecionada: "+orderForm.getCategory());
    }
    
    public void loadOrders(){  	
    	orders = new ArrayList<Order>();  	
    	orders.add(new Order(new Category("Computadores e Tablets"), "Olá! estou procurando um tablet Samsung para comprar. Pagamento à vista.", new City("São Paulo", "SP"), new User()));
    	orders.add(new Order(new Category("Computadores e Tablets"), "Estou procurando um notebook Dell Vostro 3300 de 8 Gb de RAM, 13 polegadas, 1T de HD e placa de vídeo dedicada de 2Gb. Pagamento à vista caso haja um bom desconto. Por gentileza não entrar em contato caso não seja o notebook com as características informadas.", new City("Belo Horizonte", "MG"), new User()));
    	orders.add(new Order(new Category("Computadores e Tablets"), "Olá! estou procurando um tablet Samsung para comprar. Pagamento à vista.", new City("São Paulo", "SP"), new User()));
    	orders.add(new Order(new Category("Computadores e Tablets"), "Estou procurando um notebook Dell Vostro 3300 de 8 Gb de RAM, 13 polegadas, 1T de HD e placa de vídeo dedicada de 2Gb. Pagamento à vista caso haja um bom desconto. Por gentileza não entrar em contato caso não seja o notebook com as características informadas.", new City("Belo Horizonte", "MG"), new User()));
    	orders.add(new Order(new Category("Computadores e Tablets"), "Olá! estou procurando um tablet Samsung para comprar. Pagamento à vista.", new City("São Paulo", "SP"), new User()));
    	orders.add(new Order(new Category("Computadores e Tablets"), "Estou procurando um notebook Dell Vostro 3300 de 8 Gb de RAM, 13 polegadas, 1T de HD e placa de vídeo dedicada de 2Gb. Pagamento à vista caso haja um bom desconto. Por gentileza não entrar em contato caso não seja o notebook com as características informadas.", new City("Belo Horizonte", "MG"), new User()));
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

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}