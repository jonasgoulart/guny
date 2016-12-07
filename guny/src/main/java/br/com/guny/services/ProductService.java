package br.com.guny.services;

import org.jsoup.nodes.Document;

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
						/* Identify name, image and shop name */
						return new Product(document.select(shopTag.getTagProductName()).get(0).text(), shopUrl, document.select(shopTag.getTagProductImage()).first().attr("src").replace("//static", "https://static"), shopTag.getShop());
			        }
				}
				
				return null;		        
			
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
	}
}