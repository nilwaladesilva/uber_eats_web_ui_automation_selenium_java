package co.uber.eats.selenium.pageobject.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import co.uber.eats.selenium.pageobject.PageObject;
import co.uber.eats.selenium.pageobject.home.HomePage;

public class SearchResultsPopUp extends PageObject{

	public SearchResultsPopUp(WebDriver driver, PageObject parent) {
		super(driver, parent);
	}
	
	public HomePage clickOnItem(int index) {

		//first page navigation
		driver.findElement(By.xpath("//*[@id=\"location-typeahead-home-item-" + index + "\"]")).click();
		return new HomePage(driver, null);
	}	
}
