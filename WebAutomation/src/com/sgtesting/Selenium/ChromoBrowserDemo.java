package com.sgtesting.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromoBrowserDemo {
	public static WebDriver chrome = null;
	public static void main(String[] args) {
		launchBrowswer();
		 Openbrowser();
		 closeBrowser();
	}
	private static void launchBrowswer()
	{
		try 
		{
			chrome = new ChromeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Openbrowser()
	{
		try 
		{
			chrome.get("http://localhost:81/login.do");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void closeBrowser()
	{
		try 
		{
			chrome.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
