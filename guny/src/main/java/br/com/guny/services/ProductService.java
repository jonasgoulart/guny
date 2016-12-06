package br.com.guny.services;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import br.com.guny.dao.ShopTagDAO;
import br.com.guny.domain.Product;
import br.com.guny.domain.ShopTag;
import br.com.guny.util.InternetUtil;

public class ProductService {

	public Product getProduct(String shopUrl){
		
		try{
				/* Load data page from internet */
				Document document = InternetUtil.readPage(shopUrl);
			
				for(ShopTag shopTag : new ShopTagDAO().listAll()){
					
					if(shopUrl.contains(shopTag.getShop().getSite())){
						/* Identify name and shop name */						
			        	//return new Product(document.select(shopTag.getTagProductName()).get(0).text(), shopUrl, shopTag.getShop());
						Element img = document.select(shopTag.getTagProductName()).first();
						
						String imgSrc = img.attr("src");
						
						return new Product(imgSrc, shopUrl, shopTag.getShop());
			        }
				}
				
				return null;		        
			
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
	}
}