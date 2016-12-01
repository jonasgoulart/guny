package br.com.guny.util;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import br.com.guny.domain.Product;
import br.com.guny.domain.Shop;

public class ProductUtil {

	private List<Shop> shops;
	
	public ProductUtil(){
		
		shops = new ArrayList<Shop>();
		shops.add(new Shop("submarino", "h1.product-name", "p.sales-price"));
		shops.add(new Shop("americanas", "h1.product-name", "p.sales-price"));
		shops.add(new Shop("casasbahia", "h1.fn.name", "i.sale.price"));
		shops.add(new Shop("pontofrio", "h1.fn.name", "i.sale.price"));
		//shops.add(new Shop("beefitness", "", "span.price"));
		//shops.add(new Shop("carrefour", "", "span.prince-product-default"));
		//shops.add(new Shop("ricardoeletro", "", "ProdutoDetalhesPrecoComprarAgoraPrecoDePreco"));
		shops.add(new Shop("walmart", "div.product-title-header", "span.int,span.dec"));
		shops.add(new Shop("colombo", "h1.nome-produto", "span.dados-preco-valor"));
		
	}
	
	public Product getProduct(String shopUrl){
		
		try{
				for(Shop shop : shops){
					
					if(shopUrl.contains(shop.getTagShopName())){
						
						Connection connection = Jsoup.connect(shopUrl);
						connection.userAgent("Mozilla/5.0");
						connection.timeout(10 * 1000);
						Document doc = connection.get();
						
						String[] nameArray = doc.select(shop.getTagProductName()).get(0).text().split(" ");
						
						String name = nameArray[0] + " " + nameArray[1] + " "+nameArray[2] + " "+nameArray[3];
						
						String[] array = shop.getTagProductPrice().split(",");
												
						String price = "";					
						
						for(int x = 0 ; x < array.length ; x++){							
							price = price + doc.select(array[x]).get(0).text().replace("R$", "").trim().replace("no boleto", "");
						}
									
			        	return new Product(name.replace(",", "").replace("-", ""), shopUrl, Double.parseDouble(price.replace(".", "").replace(",", ".")));
			        }
				}
				
				return null;		        
			
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
	}
}
