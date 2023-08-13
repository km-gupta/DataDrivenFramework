package com.pmagy.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	/*
	 * WebDriver
	 * Properties
	 * Logs
	 * ExtentReports
	 * DB
	 * Excel
	 * Mail
	 * */
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		
	}
	
	@AfterSuite
	public void tearDown() {
		
	}
}
