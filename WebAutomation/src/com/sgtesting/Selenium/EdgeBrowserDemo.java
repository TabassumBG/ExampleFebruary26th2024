package com.sgtesting.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserDemo {
	public static WebDriver edge = null;
	public static void main(String[] args) {
		launchBrowser();
		NavigateUrl();
		closeBrowser();
	}
	private static void launchBrowser()
	{
		try 
		{
			edge = new EdgeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void NavigateUrl()
	{
		try 
		{
			edge.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void closeBrowser()
	{
		try 
		{
			edge.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
