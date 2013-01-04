package net.blerg.webScraper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.LinkedList;
import java.util.List;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

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
	
	public <T> List<T> scrape(Class<T> type) throws FailingHttpStatusCodeException, MalformedURLException, IOException {
		
		WebClient webClient = new WebClient();
		HtmlPage page = webClient.getPage(startUrl);
		List<?> links=page.getByXPath(linkXpath);
		
		List<T> list = new LinkedList<>();
		return list;
	}
}
