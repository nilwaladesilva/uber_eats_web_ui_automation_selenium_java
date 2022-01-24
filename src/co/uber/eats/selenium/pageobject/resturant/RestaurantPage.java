package co.uber.eats.selenium.pageobject.resturant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import co.uber.eats.selenium.pageobject.PageObject;

public class RestaurantPage extends PageObject {	
	
	public RestaurantPage(WebDriver driver, PageObject parent) {
		super(driver, parent);
	}

	public SelectFoodItemPopup selectFoodItem(String foodName) {
		driver.findElement(By.xpath("//div[contains(text(),'" + foodName + "')]")).click();
		return new SelectFoodItemPopup(driver,this);
	}

	public CartPopUp viewCart() {
		try {
			// some cases cart is already popped out. No need to click the cart button.
			CartPopUp p = new CartPopUp(driver, this);
			return p;
		} catch (Exception e) {
			driver.findElement(By.xpath("//div[contains(text(),'Cart')]")).click();
			return new CartPopUp(driver, this);
		}
	}
}
