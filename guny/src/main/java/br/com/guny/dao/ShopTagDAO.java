package br.com.guny.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.guny.domain.Shop;
import br.com.guny.domain.ShopTag;

public class ShopTagDAO {
	
	public List<ShopTag> listAll(){
		
		try{
			    List<ShopTag> shops = new ArrayList<ShopTag>();
				shops.add(new ShopTag(new Shop("Submarino", "www.submarino.com.br"), "img.swiper-slide-img"));
			    //shops.add(new ShopTag(new Shop("Submarino", "www.submarino.com.br"), "h1.product-name"));
				shops.add(new ShopTag(new Shop("Americanas", "www.americanas.com.br"), "img.swiper-slide-img"));
				//shops.add(new ShopTag(new Shop("Americanas", "www.americanas.com.br"), "h1.product-name"));
				shops.add(new ShopTag(new Shop("Casas Bahia", "www.casasbahia.com.br"), "h1.fn.name"));
				shops.add(new ShopTag(new Shop("Ponto Frio", "www.pontofrio.com.br"), "h1.fn.name"));
				shops.add(new ShopTag(new Shop("Beefitness", "www.beefitness.com.br"), "h1.tituloBF"));
				shops.add(new ShopTag(new Shop("Carrefour", "www.carrefour.com.br"), "h1.title-product"));
				shops.add(new ShopTag(new Shop("Ricardo Eletro", "www.ricardoeletro.com.br"), "div.descricao-produto h1"));
				shops.add(new ShopTag(new Shop("Walmart", "www.walmart.com.br"), "div.product-title-header"));
				shops.add(new ShopTag(new Shop("Colombo", "www.colombo.com.br"), "h1.nome-produto"));
				shops.add(new ShopTag(new Shop("Netshoes", "www.netshoes.com.br"), "h1.base-title"));
				shops.add(new ShopTag(new Shop("Centauro", "www.centauro.com.br"), "h1.product-name"));
				shops.add(new ShopTag(new Shop("Kalunga", "www.kalunga.com.br"), "div.product-txt h1"));
				shops.add(new ShopTag(new Shop("Magazine Luiza", "www.magazineluiza.com.br"), "div.js-product-title.container-title-product-detail h1"));
				shops.add(new ShopTag(new Shop("Fast Shop", "www.fastshop.com.br"), "div.newTitleBar"));
				shops.add(new ShopTag(new Shop("Kabum", "www.kabum.com.br"), "h1.titulo_det"));
				shops.add(new ShopTag(new Shop("Domain Games", "www.domaingames.com.br"), "h2.font_GBlack"));
				shops.add(new ShopTag(new Shop("AliExpress", "aliexpress.com"), "h1.product-name"));
				return shops;
				
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
	}
}