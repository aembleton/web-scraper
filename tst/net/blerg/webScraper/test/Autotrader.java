package net.blerg.webScraper.test;

import java.util.List;

import net.blerg.webScraper.WebScrape;

import org.junit.Test;

public class Autotrader {

	@Test
	public void scrapeCars() {
		String startUrl="http://www.autotrader.co.uk/search/used/cars/postcode/l351rz/radius/1/onesearchad/used%2Cnearlynew%2Cnew/quicksearch/true";
		
		List<String> w = new WebScrape(startUrl).scrape(String.class);
	}
}
