package br.com.guny.util;

public class ProxyUtil {
		
	private ProxyUtil() {}
	
	public static void configProxy(){
		
		/* Proxy config */		
		if(System.getProperty("http.proxyHost") == null || System.getProperty("https.proxyHost") == null){
			
			/* For http connection */
			System.setProperty("http.proxyHost", "10.10.0.64");
			System.setProperty("http.proxyPort", "3128");
			System.setProperty("http.proxyUser", "jonas.goulart");
			System.setProperty("http.proxyPassword", "P@mcary2019");
   
			/* For https connection */
			System.setProperty("https.proxyHost", "10.10.0.64");
			System.setProperty("https.proxyPort", "3128");
			System.setProperty("https.proxyUser", "jonas.goulart");
			System.setProperty("https.proxyPassword", "P@mcary2019");
		}
	}	
}