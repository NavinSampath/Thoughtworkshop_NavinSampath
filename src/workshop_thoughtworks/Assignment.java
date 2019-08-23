package workshop_thoughtworks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment extends base{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
        Properties test;
		
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\Neweclipse\\workshop_thoughtworks\\src\\workshop_thoughtworks\\data.properties");
		prop.load(fis);
		prop.getProperty("e");
		Thread.sleep(2000);
		
		Elements e1 = new Elements(driver);
		e1.search().sendKeys(prop.getProperty("e"));
		Thread.sleep(2000);
		e1.ass1().click();
		Thread.sleep(2000);
		System.out.println(e1.ass2().getText());
		Thread.sleep(2000);
		e1.search().clear();
		e1.search().sendKeys(prop.getProperty("a"));
		Thread.sleep(2000);
		e1.sec3().click();
		Thread.sleep(2000);
		e1.search().clear();
		Thread.sleep(2000);
		e1.search().sendKeys(prop.getProperty("b"));
		Thread.sleep(2000);
		e1.sec5().click();
		Thread.sleep(2000);
		e1.search().clear();
		Thread.sleep(2000);
		e1.search().sendKeys(prop.getProperty("c"));
		Thread.sleep(2000);
		e1.cheese1().click();
		

		
		
	}

}
