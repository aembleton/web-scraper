package net.blerg.webScraper;

import java.util.LinkedList;
import java.util.List;

public class WebScrape {
	
	private String startUrl="";
	private String linkXpath="";
	private String nextXpath="";
	
	public WebScrape(String startUrl) {
		this.startUrl=startUrl;
	}
	
	public WebScrape clickLinks(String linkXpath) {
		this.linkXpath=linkXpath;
		return this;
	}
	
	public WebScrape moveToTheNextPageWith(String nextXpath) {
		this.nextXpath=nextXpath;
		return this;
	}
	
	public <T> List<T> scrape(Class<T> type) {
		List<T> list = new LinkedList<>();
		return list;
	}
}
