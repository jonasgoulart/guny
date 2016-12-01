package br.com.guny.util;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Document;

import br.com.guny.domain.Product;
import br.com.guny.domain.Shop;

public class ProductUtil {

	private List<Shop> shops;
	
	public ProductUtil(){
		
		shops = new ArrayList<Shop>();
		shops.add(new Shop("Submarino", "submarino", "h1.product-name", "p.sales-price"));
		shops.add(new Shop("Americanas", "americanas", "h1.product-name", "p.sales-price"));
		shops.add(new Shop("Casas Bahia", "casasbahia", "h1.fn.name", "i.sale.price"));
		shops.add(new Shop("Ponto Frio", "pontofrio", "h1.fn.name", "i.sale.price"));
		shops.add(new Shop("Beefitness", "beefitness", "h1.tituloBF", "span.price"));
		shops.add(new Shop("Carrefour", "carrefour", "h1.title-product", "span.prince-product-default"));
		shops.add(new Shop("Ricardo Eletro", "ricardoeletro", "div.descricao-produto h1", "span[id=ProdutoDetalhesPrecoComprarAgoraPrecoDePreco]"));
		shops.add(new Shop("Walmart", "walmart", "div.product-title-header", "span.int,span.dec"));
		shops.add(new Shop("Colombo", "colombo", "h1.nome-produto", "span.dados-preco-valor"));
		shops.add(new Shop("Netshoes", "netshoes", "h1.base-title", "strong.new-price"));
		shops.add(new Shop("Centauro", "centauro", "h1.product-name", "li.current"));
		shops.add(new Shop("Kalunga", "kalunga", "div.product-txt h1", "span.valor"));
	}
	
	public Product getProduct(String shopUrl){
		
		try{
				Document document = InternetUtil.readPage(shopUrl);
			
				for(Shop shop : shops){
					
					if(shopUrl.contains(shop.getTagShopName())){

						/* Configure product name */
						String[] nameArray = document.select(shop.getTagProductName()).get(0).text().split(" ");
												
						String name = "";
						
						int nameSize = 5;
						
						if(nameArray.length < 5){
							nameSize = nameArray.length;
						}
						
						for(int x = 0 ; x < nameSize ; x++){
							name = name + " " + nameArray[x];
						}
						
						
						/* Configure product price */
						String[] priceArray = shop.getTagProductPrice().split(",");
												
						String price = "";					
						
						for(int x = 0 ; x < priceArray.length ; x++){							
							price = price + document.select(priceArray[x]).get(0).text().replace("R$", "").trim().replace("no boleto", "").trim().replace("Por:", "");
						}
									
			        	return new Product(name, shopUrl, Double.parseDouble(price.replace(".", "").replace(",", ".")), shop);
			        }
				}
				
				return null;		        
			
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
	}
}