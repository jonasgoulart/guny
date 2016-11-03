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
		
    public OrderMB() {
    	
        model = new CategoryService().getAllCategories();
        
        /*new DefaultTagCloudModel();
        model.addTag(new DefaultTagCloudItem("C�meras e Filmadoras", 2));
        model.addTag(new DefaultTagCloudItem("Celulares e Telefonia", 5));
        model.addTag(new DefaultTagCloudItem("DVDs e Blu-ray", 2));
        model.addTag(new DefaultTagCloudItem("Eletrodom�sticos", 5));
        model.addTag(new DefaultTagCloudItem("Eletr�nicos", 4));
        model.addTag(new DefaultTagCloudItem("Inform�tica e Tablet", 3));
        model.addTag(new DefaultTagCloudItem("Instrumentos Musicais", 1));
        model.addTag(new DefaultTagCloudItem("Livros", 3));
        model.addTag(new DefaultTagCloudItem("TV, �udio e Home Theater", 4));
        model.addTag(new DefaultTagCloudItem("Viagens", 3));   
        */ 
    }
	
    
    public void loadDataOrder(){
    	
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
}