package co.uber.eats.selenium.pageobject.resturant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import co.uber.eats.selenium.pageobject.PageObject;

public class SelectFoodItemPopup extends PageObject{

	public SelectFoodItemPopup(WebDriver driver, PageObject parent) {
		super(driver, parent);
	}

	public SelectFoodItemPopup addSpecialInstructions(String instructions) {
		//TODO implement the logic
		return this;
	}
	
	public RestaurantPage addOrder() {
		// press the add to order button
		driver.findElement(By.xpath("//button/div[contains(text(),'to order')]")).click();
		return (RestaurantPage) parent;
	}

	public SelectFoodItemPopup choiseOfSize(String size) {
		//size = Ex.:Small or Regular
		driver.findElement(By.xpath("//div[contains(text(),'" + size + "')]")).click();
		return this;
	}	
}
