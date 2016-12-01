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

						/* Configure product name */
						String[] nameArray = document.select(shopTag.getTagProductName()).get(0).text().split(" ");
												
						String productName = "";
						
						/* Limit identify product name */
						int nameSize = 5;
						
						if(nameArray.length < 5){
							nameSize = nameArray.length;
						}
						
						for(int x = 0 ; x < nameSize ; x++){
							productName = productName + " " + nameArray[x];
						}						
						
						/* Configure product price */
						String[] priceArray = shopTag.getTagProductPrice().split(",");
												
						String productPrice = "";					
						
						for(int x = 0 ; x < priceArray.length ; x++){							
							productPrice = productPrice + document.select(priceArray[x]).get(0).text().replace("R$", "").trim().replace("no boleto", "").trim().replace("Por:", "");
						}
									
			        	return new Product(productName, shopUrl, Double.parseDouble(productPrice.replace(".", "").replace(",", ".")), shopTag.getShop());
			        }
				}
				
				return null;		        
			
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
	}
}