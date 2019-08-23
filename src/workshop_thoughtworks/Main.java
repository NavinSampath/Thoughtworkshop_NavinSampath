package workshop_thoughtworks;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import java.io.FileInputStream;
import java.util.Properties;


public class Main extends base {

	public static void main(String[] args) throws InterruptedException, IOException 
	
	{
		Properties test;
		
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\Neweclipse\\workshop_thoughtworks\\src\\workshop_thoughtworks\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("e"));
		Thread.sleep(2000);
		//To check the P0-Ship stopper 
		
		//Whether the URL is getting launched or not 
		Elements e = new Elements(driver);
		Thread.sleep(2000);
		System.out.println("First Test Case Successfully landed in the respective URL");
		//driver.getTitle();
		
		//To check whether there are two sections present in the web page 
		String tes = e.sec1().getText();
		Thread.sleep(2000);
		String tes1 = e.sec2().getText();
		Thread.sleep(2000);
		Boolean ww = tes.equals(tes1);
		System.out.println("Second Test Case-There are two sections present in the webpage");
		
		//To check whether the search text box allows user to enter the values 
		e.search().sendKeys(prop.getProperty("e"));
		Thread.sleep(2000);
		
		
		//To select the first values in the suggestion 
		e.cheese().click();
		String tst = e.cheese().getText();
		System.out.println(tst);
		Thread.sleep(2000);
		System.out.println("Third Test Case - The first values in the suggestion list has been added");
		Thread.sleep(2000);
		String tst1 = e.firlist().getText();
		Thread.sleep(2000);
		System.out.println(tst1);
		Boolean be = tst.equals(tst1);
		System.out.println("Fourth test case - The Selected product is cheese, blue");
		Thread.sleep(2000);
		
		//Deleting the products in the table 
		e.trash().click();
		Thread.sleep(2000);
		

		
		
		
	}

}
