package co.uber.eats.selenium.pageobject.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import co.uber.eats.selenium.pageobject.PageObject;

public class StartPage extends PageObject {
	
	public StartPage(WebDriver driver) {
		super(driver, null);
	}

	public StartPage searchFor(String serachText) {
		WebElement inputSearch = driver.findElement(By.xpath("//*[@id=\"location-typeahead-home-input\"]"));
		inputSearch.sendKeys("uoc");
		return this;
	}
	
	public SearchResultsPopUp getSerachResults() {
		return new SearchResultsPopUp(driver, this);
	}
}
