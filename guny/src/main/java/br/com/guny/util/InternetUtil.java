package br.com.guny.util;

import java.util.Date;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import br.com.guny.enums.UserAgentEnum;

public class InternetUtil{
	
	private static Document document;
	
	private InternetUtil() {}

	public static Document readPage(String shopUrl){
		
		try{			
				System.out.println("Start: "+new Date());
			
				/* Proxy configuration */
				//ProxyUtil.configProxy();	
			
				/* Access URL */
				Connection connection = Jsoup.connect(shopUrl);
				connection.userAgent(UserAgentEnum.CHROME.getValue());
				connection.timeout(10 * 10000);
				document = connection.get();
				
				System.out.println("Final: "+new Date());
				
				return document;
				
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
	}
}
