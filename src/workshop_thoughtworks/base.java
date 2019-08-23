package workshop_thoughtworks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base 

{
	public static WebDriver driver ;
	public static Properties test;
	
	public WebDriver openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Neweclipse\\workshop_thoughtworks\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://food-calorie-planner.herokuapp.com/");
		return driver;
	}
	
	
	
	public WebDriver firefoxopen()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Neweclipse\\workshop_thoughtworks\\drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://food-calorie-planner.herokuapp.com/");
		System.out.println(driver.getTitle());
		return driver;
	}
		
}
