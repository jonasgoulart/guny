package br.com.guny.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.tagcloud.TagCloudModel;

import br.com.guny.services.CategoryService;

@ManagedBean
@ViewScoped
public class OrderMB {
	
	private TagCloudModel model;
	private String title = null;
	private String username;
		
    public OrderMB() {
    	
        model = new CategoryService().getTagCloudModelCategory();
        
        /*new DefaultTagCloudModel();
        model.addTag(new DefaultTagCloudItem("Câmeras e Filmadoras", 2));
        model.addTag(new DefaultTagCloudItem("Celulares e Telefonia", 5));
        model.addTag(new DefaultTagCloudItem("DVDs e Blu-ray", 2));
        model.addTag(new DefaultTagCloudItem("Eletrodomésticos", 5));
        model.addTag(new DefaultTagCloudItem("Eletrônicos", 4));
        model.addTag(new DefaultTagCloudItem("Informática e Tablet", 3));
        model.addTag(new DefaultTagCloudItem("Instrumentos Musicais", 1));
        model.addTag(new DefaultTagCloudItem("Livros", 3));
        model.addTag(new DefaultTagCloudItem("TV, Áudio e Home Theater", 4));
        model.addTag(new DefaultTagCloudItem("Viagens", 3));   
        */ 
    }
	
    
    public void loadDataOrder(){
    	
    	username = "Jonas";
    }
    
    public TagCloudModel getModel() {
        return model;
    }
     
    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}