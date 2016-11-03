package br.com.guny.services;

import java.util.ArrayList;
import java.util.List;

import org.primefaces.model.tagcloud.DefaultTagCloudItem;
import org.primefaces.model.tagcloud.DefaultTagCloudModel;
import org.primefaces.model.tagcloud.TagCloudModel;

import br.com.guny.domain.Category;

public class CategoryService {
	
	public TagCloudModel getTagCloudModelCategory(){
		
		/* Listar todas as categorias ativas */
		List<Category> categories = new ArrayList<Category>();
		categories.add(new Category("Câmeras e Filmadoras"));
		categories.add(new Category("Celulares e Smartphones"));	
		categories.add(new Category("Computadores e Tablets"));
		categories.add(new Category("DVDs e Blu-ray"));
		categories.add(new Category("Eletrodomésticos"));
		categories.add(new Category("Eletrônicos"));
		categories.add(new Category("Games"));		
		categories.add(new Category("Ingressos"));
		categories.add(new Category("Instrumentos Musicais"));
		categories.add(new Category("Livros"));
		categories.add(new Category("Moda, Beleza e Perfumaria"));
		categories.add(new Category("TV, Áudio e Home Theater"));
		categories.add(new Category("Viagens"));
		
		
		TagCloudModel model = new DefaultTagCloudModel();
			
		/* Montar a lista de categorias a serem exibidas no TagCloudModel do primefaces */
		for(Category category : categories){
			
			model.addTag(new DefaultTagCloudItem(category.getName(), (int)(5 * Math.random())));
		}
			
		return model;
	}
}
