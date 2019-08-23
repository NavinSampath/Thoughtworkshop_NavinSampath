package workshop_thoughtworks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements extends base
{
	public static WebDriver driver ;
	
	public Elements(WebDriver driver)
	{
		this.driver = firefoxopen();
	}

	
	By  search = By.xpath("//input[@placeholder='Search foods...']");
	By cheese = By.xpath("//div[@id='food-search']//td[contains(text(),'Cheese, blue')]");
	By cheese1 = By.cssSelector(" div.App div.ui.text.container div:nth-child(2) table.ui.selectable.structured.large.table tbody:nth-child(2) tr:nth-child(1) > td:nth-child(1)");
	By firstlist = By.cssSelector("div.App div.ui.text.container table.ui.selectable.structured.large.table:nth-child(1) tbody:nth-child(2) tr:nth-child(1) > td:nth-child(1)");
	By trash = By.cssSelector("div.App div.ui.text.container table.ui.selectable.structured.large.table:nth-child(1) tbody:nth-child(2) tr:nth-child(1) > td.trash:nth-child(7)");
	By sec1 = By.cssSelector("div.App div.ui.text.container table.ui.selectable.structured.large.table:nth-child(1) thead:nth-child(1) tr:nth-child(1) th:nth-child(1) > h3:nth-child(1)");
	By sec2 = By.cssSelector("div.App div.ui.text.container table.ui.selectable.structured.large.table thead:nth-child(1) tr:nth-child(1) th:nth-child(1) > div.ui.fluid.search");
	
	By ass1 = By.cssSelector("div.App div.ui.text.container div:nth-child(2) table.ui.selectable.structured.large.table tbody:nth-child(2) tr:nth-child(1) > td:nth-child(1)");
	By ass2 = By.cssSelector("	div.App div.ui.text.container table.ui.selectable.structured.large.table:nth-child(1) tbody:nth-child(2) tr:nth-child(1) > td:nth-child(1)");
	By sec3 = By.cssSelector("div.App div.ui.text.container div:nth-child(2) table.ui.selectable.structured.large.table tbody:nth-child(2) tr:nth-child(1) > td:nth-child(1)");
	By sec4 = By.cssSelector("div.App div.ui.text.container table.ui.selectable.structured.large.table:nth-child(1) tbody:nth-child(2) tr:nth-child(1) > td:nth-child(1)");
	By sec5 = By.cssSelector("div.App div.ui.text.container div:nth-child(2) table.ui.selectable.structured.large.table tbody:nth-child(2) tr:nth-child(1) > td:nth-child(1)");
	By sec6 = By.cssSelector("");

	
	public WebElement search()
	{
		return driver.findElement(search);
	}
	
	public WebElement cheese()
	{
		return driver.findElement(cheese);
	}
	
	public WebElement cheese1()
	{
		return driver.findElement(cheese1);
	}
	
	public WebElement firlist()
	{
		return driver.findElement(firstlist);
	}
	
	public WebElement trash()
	{
		return driver.findElement(trash);
	}
	public WebElement sec1()
	{
		return driver.findElement(sec1);
	}
	public WebElement sec2()
	{
		return driver.findElement(sec1);
	}
	public WebElement ass1()
	{
		return driver.findElement(ass1);
	}
	public WebElement ass2()
	{
		return driver.findElement(ass1);
	}
	public WebElement sec3()
	{
		return driver.findElement(sec3);
	}
	public WebElement sec4()
	{
		return driver.findElement(sec4);
	}
	public WebElement sec5()
	{
		return driver.findElement(sec5);
	}
}
	
	

