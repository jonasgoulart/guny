package br.com.guny.services;

import java.util.ArrayList;
import java.util.List;

import br.com.guny.domain.Product;

public class ProductServiceTest {
		
	public static void main(String[] args) {
		
		List<String> urls = new ArrayList<String>();
		
		urls.add("http://www.submarino.com.br/produto/124132646/smartphone-samsung-galaxy-j5-duos-dual-chip-android-5.1-tela-5-16gb-4g-wi-fi-camera-13mp-dourado");
		urls.add("http://www.americanas.com.br/produto/124132646/smartphone-samsung-galaxy-j5-duos-dual-chip-android-5.1-tela-5-16gb-4g-wi-fi-camera-13mp-dourado");
		urls.add("http://www.casasbahia.com.br/TelefoneseCelulares/Smartphones/Android/Smartphone-Samsung-Galaxy-J5-Duos-Dourado-com-Dual-chip-Tela-5-0-4G-Camera-13MP-Android-5-1-e-Processador-Quad-Core-de-1-2-Ghz-5409356.html?IdProduto=2574335&recsource=btermo&rectype=p1_op_s1");		
		urls.add("https://www.colombo.com.br/produto/Smartphones/Smartphone-Samsung-Galaxy-J5-Duos-4G-Android-5-1-16GB-13MP-Dourado-J500M-DS");
		urls.add("https://www.colombo.com.br/produto/Eletrodomesticos/Refrigerador-Geladeira-Brastemp-Frost-Free-2-Portas-352-Litros-BRM39EB?gclid=CjwKEAiAjvrBBRDxm_nRusW3q1QSJAAzRI1t1N7LEfOeo0W3DDEOp59HO7ahwR8ypahhyRpRhu2KkBoCipbw_wcB");
		urls.add("https://www.walmart.com.br/smartphone-samsung-galaxy-j5-sm-j500m-ds-dourado-dual-chip-android-5-1-lollipop-4g-wi-fi-16gb/telefonia/celulares-e-smartphones/3216990/pr");
		urls.add("http://www.pontofrio.com.br/TelefoneseCelulares/Smartphones/Android/Smartphone-Samsung-Galaxy-J5-Duos-Dourado-com-Dual-chip-Tela-5-0-4G-Camera-13MP-Android-5-1-e-Processador-Quad-Core-de-1-2-Ghz-5409356.html?IdProduto=2574335&recsource=btermo&rectype=p1_op_s1");
		urls.add("http://www.netshoes.com.br/produto/tenis-pretorian-knockout-D36-0244-026?&lkey=a4");
		urls.add("http://www.centauro.com.br/bota-nord-outdoor-titanium-masculina-10200-856395.html?cor=02");
		urls.add("http://www.centauro.com.br/bicicleta-ergometrica-kikos-spinning-f5-804247.html?cor=19");
		urls.add("http://www.kalunga.com.br/prod/roteador-repetidor-wireless-4-portas-n-300mbps-dir-615-d-link/610383?menuID=50&WT.svl=3");
		urls.add("http://www.kalunga.com.br/prod/monitor-led-21-5-ips-widescreen-22mp58vq-lg/477100?menuID=47&WT.svl=6");
		urls.add("http://www.ricardoeletro.com.br/Produto/Celular-Smartphone-Samsung-Galaxy-J5-Duos-J500M-Dourado-Dual-Chip-4G-Tela-5-Camera-13MP-Frontal-5MP-com-Flash-Quad-Core-de-12-Ghz-16GB/44-491-496-549523");
		urls.add("https://www.carrefour.com.br/Smartphone-Samsung-Galaxy-J5-Duos-SMJ500-16GB-Preto-4G-Tela-5-Camera-13MP-Android-5-1/p/9750584");
		urls.add("http://www.beefitness.com.br/celulares/Samsung/samsung-j500b-preto.htm?gclid=CjwKEAiAjvrBBRDxm_nRusW3q1QSJAAzRI1t4CskbbdVbLmf5gf0GbNdLAY1WbZ5efhymniGidybVhoC2r_w_wcB");		
		urls.add("http://www.magazineluiza.com.br/smartphone-asus-zenfone-2-32gb-preto-dual-chip-4g-cam.-13mp-selfie-5mp-5.5-full-hd-quad-core/p/2158866/te/zen2/?utm_source=google&utm_medium=pla&cmptype=pla&profileid=410&campaignid=60&keyword=&gclid=COu619Hb09ACFUmBkQod0ZwCtw");
		urls.add("http://www.fastshop.com.br/loja/smart-tv-samsung-hd-32-wi-fi-un32j4300agxzd-fast?cm_re=FASTSHOP%3a-_-Vitrine+01-_-SGUN32J430PTO");
		urls.add("http://www.fastshop.com.br/loja/especial-lojas/-mundo-lenovo/notebook-lenovo-i7-8gb-1tb-prata-80uh0004b-microsoft-office-365-personal-fast?cm_re=FASTSHOP%3aSub-departamento%3aLenovo-_-Vitrine+09-_-L2CJ80UH000400");
		urls.add("http://www.kabum.com.br/produto/58804/fonte-xigmatek-calibre-600w-xcp-a600-80plus");
		urls.add("http://www.domaingames.com.br/magicthegathering/cards/caverna-das-almas_cavern-of-souls/22335/");				
		urls.add("https://pt.aliexpress.com/item/Building-Block-Set-Compatible-with-lego-city-ship-Titanic-RMS-Titanic-3D-Construction-Brick-Educational-Hobbies/32649571798.html?spm=2114.42010308.4.2.BkMV8S");
		urls.add("https://pt.aliexpress.com/item/DHL-free-Factory-unlock-Genuine-original-iPhone-6s-iPhone-6s-plus-mobile-Phone-16GB-64GB-GSM/32502871211.html?spm=2114.30010508.3.20.AsCmxX&ws_ab_test=searchweb0_0,searchweb201602_3_10065_10068_10084_10083_10080_10082_10081_10060_10061_10062_10056_10055_10054_10059_10099_10078_10079_426_10073_10102_10096_10052_10050_425_10051,searchweb201603_8&btsid=9ccfc4e1-a78b-4a31-af0b-ed39304b2353");
		
		
		for(String url : urls){
			Product product = new ProductService().getProduct(url);
			System.out.println("Produto: "+product.getDescribe());
			System.out.println("Onde: "+ product.getShop().getName());
			System.out.println("------------------------------------------");
		}
	}
}