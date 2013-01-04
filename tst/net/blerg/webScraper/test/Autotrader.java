package net.blerg.webScraper.test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import net.blerg.webScraper.WebScrape;

import org.junit.Test;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;

public class Autotrader {

	@Test
	public void scrapeCars() {
		String startUrl="http://www.autotrader.co.uk/search/used/cars/postcode/l351rz/radius/1/onesearchad/used%2Cnearlynew%2Cnew/quicksearch/true";
		
		try {
			List<String> w = new WebScrape(startUrl).scrape(String.class);
		} catch (FailingHttpStatusCodeException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
