package br.com.guny.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class OrderNotificationMB implements Serializable {
     
	private static final long serialVersionUID = 1L;
	private String message = "";
	private int number;
 
    public String getMessage() {
		return message;
	}

	public void verify() {
        number++;
        message = "Você tem ("+number+") novo(s) pedido(s)!";
    }
}
