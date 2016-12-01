package br.com.guny.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import br.com.guny.domain.Product;
import br.com.guny.util.ProductUtil;

public class PriceService {
	
	public static void main(String[] args) {
		
		List<String> urls = new ArrayList<String>();
		urls.add("http://www.submarino.com.br/produto/124132646/smartphone-samsung-galaxy-j5-duos-dual-chip-android-5.1-tela-5-16gb-4g-wi-fi-camera-13mp-dourado");
		urls.add("http://www.americanas.com.br/produto/124132646/smartphone-samsung-galaxy-j5-duos-dual-chip-android-5.1-tela-5-16gb-4g-wi-fi-camera-13mp-dourado");
		urls.add("http://www.casasbahia.com.br/TelefoneseCelulares/Smartphones/Android/Smartphone-Samsung-Galaxy-J5-Duos-Dourado-com-Dual-chip-Tela-5-0-4G-Camera-13MP-Android-5-1-e-Processador-Quad-Core-de-1-2-Ghz-5409356.html?IdProduto=2574335&recsource=btermo&rectype=p1_op_s1");
		urls.add("https://www.colombo.com.br/produto/Smartphones/Smartphone-Samsung-Galaxy-J5-Duos-4G-Android-5-1-16GB-13MP-Dourado-J500M-DS");
		urls.add("https://www.colombo.com.br/produto/Eletrodomesticos/Refrigerador-Geladeira-Brastemp-Frost-Free-2-Portas-352-Litros-BRM39EB?gclid=CjwKEAiAjvrBBRDxm_nRusW3q1QSJAAzRI1t1N7LEfOeo0W3DDEOp59HO7ahwR8ypahhyRpRhu2KkBoCipbw_wcB");
		urls.add("https://www.walmart.com.br/smartphone-samsung-galaxy-j5-sm-j500m-ds-dourado-dual-chip-android-5-1-lollipop-4g-wi-fi-16gb/telefonia/celulares-e-smartphones/3216990/pr");
		urls.add("http://www.pontofrio.com.br/TelefoneseCelulares/Smartphones/Android/Smartphone-Samsung-Galaxy-J5-Duos-Dourado-com-Dual-chip-Tela-5-0-4G-Camera-13MP-Android-5-1-e-Processador-Quad-Core-de-1-2-Ghz-5409356.html?IdProduto=2574335&recsource=btermo&rectype=p1_op_s1");

		for(String url : urls){
			Product product = new ProductUtil().getProduct(url);
			System.out.println(product.getDescribe() +" - "+ product.getPrice());
		}
	}
	
	
	
	public void maint(String[] args) throws IOException {

		List<String> urls = new ArrayList<String>();
		urls.add("http://www.submarino.com.br/produto/124132646/smartphone-samsung-galaxy-j5-duos-dual-chip-android-5.1-tela-5-16gb-4g-wi-fi-camera-13mp-dourado");
		urls.add("http://www.americanas.com.br/produto/124132646/smartphone-samsung-galaxy-j5-duos-dual-chip-android-5.1-tela-5-16gb-4g-wi-fi-camera-13mp-dourado");
		urls.add("http://www.casasbahia.com.br/TelefoneseCelulares/Smartphones/Android/Smartphone-Samsung-Galaxy-J5-Duos-Dourado-com-Dual-chip-Tela-5-0-4G-Camera-13MP-Android-5-1-e-Processador-Quad-Core-de-1-2-Ghz-5409356.html?IdProduto=2574335&recsource=btermo&rectype=p1_op_s1");
		urls.add("http://www.pontofrio.com.br/TelefoneseCelulares/Smartphones/Android/Smartphone-Samsung-Galaxy-J5-Duos-Dourado-com-Dual-chip-Tela-5-0-4G-Camera-13MP-Android-5-1-e-Processador-Quad-Core-de-1-2-Ghz-5409356.html?IdProduto=2574335&recsource=btermo&rectype=p1_op_s1");
		urls.add("http://www.beefitness.com.br/celulares/Samsung/samsung-j500b-preto.htm?gclid=CjwKEAiAjvrBBRDxm_nRusW3q1QSJAAzRI1t4CskbbdVbLmf5gf0GbNdLAY1WbZ5efhymniGidybVhoC2r_w_wcB");
		urls.add("https://www.carrefour.com.br/Smartphone-Samsung-Galaxy-J5-Duos-SMJ500-16GB-Preto-4G-Tela-5-Camera-13MP-Android-5-1/p/9750584");
		urls.add("http://www.girafa.com.br/Celulares/Samsung/samsung-j500b-preto.htm?gclid=CjwKEAiAjvrBBRDxm_nRusW3q1QSJAAzRI1txl_5uTokwQZLcr91LCNIYMToTiy-hp8Ziq6Uv9ns_RoCE2Tw_wcB");
		urls.add("http://www.ricardoeletro.com.br/Produto/Celular-Smartphone-Samsung-Galaxy-J5-Duos-J500M-Dourado-Dual-Chip-4G-Tela-5-Camera-13MP-Frontal-5MP-com-Flash-Quad-Core-de-12-Ghz-16GB/44-491-496-549523");
		urls.add("https://www.walmart.com.br/smartphone-samsung-galaxy-j5-sm-j500m-ds-dourado-dual-chip-android-5-1-lollipop-4g-wi-fi-16gb/telefonia/celulares-e-smartphones/3216990/pr");
		urls.add("https://www.colombo.com.br/produto/Smartphones/Smartphone-Samsung-Galaxy-J5-Duos-4G-Android-5-1-16GB-13MP-Dourado-J500M-DS");
		urls.add("http://www.casasbahia.com.br/Eletrodomesticos/maquinadelavar/Acimade10kg/Lavadora-de-Roupas-Brastemp-11-kg-BWJ11AB-com-Turbo-Performance-%E2%80%93-Branca-10030421.html?recsource=home-13_4-3-1-1_5_19591&rectype=11667-int");
		urls.add("http://www.casasbahia.com.br/Eletronicos/Televisores/SmartTV/Smart-TV-LED-43-Full-HD-LG-43LH5700-com-Painel-IPS-Wi-Fi-Miracast-WiDi-Entradas-HDMI-e-Entrada-USB-8039200.html?recsource=home-1_4-3-1-1_5_19592&rectype=11668-int");
		urls.add("https://www.colombo.com.br/produto/Eletrodomesticos/Refrigerador-Geladeira-Brastemp-Frost-Free-2-Portas-352-Litros-BRM39EB?gclid=CjwKEAiAjvrBBRDxm_nRusW3q1QSJAAzRI1t1N7LEfOeo0W3DDEOp59HO7ahwR8ypahhyRpRhu2KkBoCipbw_wcB");
		
		//String url = "http://www.submarino.com.br/produto/124132646/smartphone-samsung-galaxy-j5-duos-dual-chip-android-5.1-tela-5-16gb-4g-wi-fi-camera-13mp-dourado";
        //String url = "http://www.americanas.com.br/produto/124132646/smartphone-samsung-galaxy-j5-duos-dual-chip-android-5.1-tela-5-16gb-4g-wi-fi-camera-13mp-dourado";
		//String url = "http://www.casasbahia.com.br/TelefoneseCelulares/Smartphones/Android/Smartphone-Samsung-Galaxy-J5-Duos-Dourado-com-Dual-chip-Tela-5-0-4G-Camera-13MP-Android-5-1-e-Processador-Quad-Core-de-1-2-Ghz-5409356.html?IdProduto=2574335&recsource=btermo&rectype=p1_op_s1";
		//String url = "http://www.pontofrio.com.br/TelefoneseCelulares/Smartphones/Android/Smartphone-Samsung-Galaxy-J5-Duos-Dourado-com-Dual-chip-Tela-5-0-4G-Camera-13MP-Android-5-1-e-Processador-Quad-Core-de-1-2-Ghz-5409356.html?IdProduto=2574335&recsource=btermo&rectype=p1_op_s1";
		
		
		/* Proxy config */
		/*System.setProperty("http.proxyHost", "10.10.0.64");
        System.setProperty("http.proxyPort", "3128");
        System.setProperty("http.proxyUser", "jonas.goulart");
        System.setProperty("http.proxyPassword", "P@mcary2019");
       
        System.setProperty("https.proxyHost", "10.10.0.64");
        System.setProperty("https.proxyPort", "3128");
        System.setProperty("https.proxyUser", "jonas.goulart");
        System.setProperty("https.proxyPassword", "P@mcary2019");
        */
		
        System.out.println("Loading prices...");
        
        List<Product> products = new ArrayList<Product>();
        
        String price = null;
        String name = null;
        String[] nameArray = null;
		
		for(String url : urls){
						
			Connection connection = Jsoup.connect(url);
	        connection.userAgent("Mozilla/5.0");
	        connection.timeout(10 * 1000);
	        Document doc = connection.get();
	        Elements prices = null;
	        String shopName = null;
	        
	        /* p - Para Submarino, Americanas e Ricardo Eletro */
	        if(url.contains("submarino")){
	        	shopName = "Submarino";	        	
	        	prices = doc.select("p.sales-price");
	        	price = prices.get(0).text().replace("R$", "").trim();
	        	nameArray = doc.select("h1.product-name").get(0).text().split(" ");
	        }
	        
	        if(url.contains("americanas")){
	        	shopName = "Americanas";
	        	prices = doc.select("p.sales-price");
	        	price = prices.get(0).text().replace("R$", "").trim();
	        	nameArray = doc.select("h1.product-name").get(0).text().split(" ");
	        }

	        /* i - Para Casas Bahia e Ponto Frio */
	        if(url.contains("casasbahia")){
	        	shopName = "Casas Bahia";
	        	prices = doc.select("i.sale.price");
	        	price = prices.get(0).text().replace("R$", "").trim();        	
	        	nameArray = doc.select("h1.fn.name").get(0).text().split(" ");	        	
	        }
	        
	        if(url.contains("pontofrio")){
	        	shopName = "Ponto Frio";        	
	        	prices = doc.select("i.sale.price");
	        	price = prices.get(0).text().replace("R$", "").trim();
	        }
	        	        
	        /* span - Para Magazine Luiza e Carrefour */
	        if(url.contains("beefitness")){
	        	shopName = "Beefitness";
	        	prices = doc.select("span.price");
	        	price = prices.get(0).text().replace("R$", "").trim();
	        }
	        	        
	        if(url.contains("carrefour")){
	        	shopName = "Carrefour";
	        	prices = doc.select("span.prince-product-default");
	        	price = prices.get(0).text().replace("R$", "").trim();
	        }
	        
	        if(url.contains("ricardoeletro")){
	        	shopName = "Ricardo Eletro";
	        	prices = doc.getElementById("ProdutoDetalhesPrecoComprarAgoraPrecoDePreco").getAllElements();
	        	price = prices.get(0).text().replace("R$", "").trim();
	        }
	        
	        if(url.contains("walmart")){
	        	shopName = "Walmart";
	        	price = doc.select("span.int").get(0).text().replace("R$", "").trim() + doc.select("span.dec").get(0).text().replace("R$", "").trim();
	        }
	        
	        if(url.contains("colombo")){
	        	shopName = "Colombo";
	        	prices = doc.select("span.dados-preco-valor");
	        	price = prices.get(0).text().replace("R$", "").trim();
	        	price = price.replace("no boleto", "");
	        	nameArray = doc.select("h1.nome-produto").get(0).text().split(" ");
	        }	        

	        
	        
	        
	        /* strong - Girafa */
	        if(url.contains("girafa")){
	        	shopName = "Girafa";
	        	prices = doc.select("strong");
	        	price = prices.get(0).text().replace("R$", "").trim();
	        }
	        
	        name = nameArray[0] + " " + nameArray[1] + " "+nameArray[2] + " "+nameArray[3];
	        
	        System.out.println(name +" price in " + shopName +": "+ price);
	        
	        Product product = new Product(name.replace(",", "").replace("-", ""), url, Double.parseDouble(price.replace(".", "").replace(",", ".")));
	        products.add(product);
	        
	        //System.out.println(name +" price in " + shopName +": "+ price);
		}
		
		
		for(Product product : products){
			System.out.println(product.getDescribe() + ": "+product.getPrice());
		}
		

		
        
              
        
        //Connection connection = Jsoup.connect(url);
        //connection.userAgent("Mozilla/5.0");
        //connection.timeout(10 * 1000);
        //Document doc = connection.get();
        //Elements links = doc.select("a[href]");
        //Elements media = doc.select("[src]");
        //Elements imports = doc.select("link[href]");
        
        /* Para Submarino e Americanas */
        //Elements priceWithTagP = doc.select("p.sales-price");
        
        /* Para Casas Bahia e Ponto Frio */
       // Elements priceWithTagI = doc.select("i.sale.price");
        
        
        /*print("\nMedia: (%d)", media.size());
        for (Element src : media) {
            if (src.tagName().equals("img"))
                print(" * %s: <%s> %sx%s (%s)",
                        src.tagName(), src.attr("abs:src"), src.attr("width"), src.attr("height"),
                        trim(src.attr("alt"), 20));
            else
                print(" * %s: <%s>", src.tagName(), src.attr("abs:src"));
        }

        print("\nImports: (%d)", imports.size());
        for (Element link : imports) {
            print(" * %s <%s> (%s)", link.tagName(),link.attr("abs:href"), link.attr("rel"));
        }

        print("\nLinks: (%d)", links.size());
        for (Element link : links) {
            print(" * a: <%s>  (%s)", link.attr("abs:href"), trim(link.text(), 35));
        }*/
        
        /* Price */
        //print("\nPrice with Tag P: (%d)", priceWithTagP.size());
        //for (Element e : priceWithTagP) {
        //    print(" * price: <%s>  (%s)", e.attr("abs:href"), trim(e.text(), 35).replace("R$", "").trim());
        //}
        
        //print("\nPrice with Tag I: (%d)", priceWithTagI.size());
        //for (Element i : priceWithTagI) {
        //    print(" * price: <%s>  (%s)", i.attr("abs:href"), trim(i.text(), 35).replace("R$", "").trim());
       // }
    }

   /* private static void print(String msg, Object... args) {
        System.out.println(String.format(msg, args));
    }

    private static String trim(String s, int width) {
        if (s.length() > width)
            return s.substring(0, width-1) + ".";
        else
            return s;
    }*/
}