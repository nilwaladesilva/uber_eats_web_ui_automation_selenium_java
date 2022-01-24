package co.uber.eats.selenium.pageobject.quikoption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import co.uber.eats.selenium.pageobject.PageObject;
import co.uber.eats.selenium.pageobject.resturant.RestaurantPage;

public class FoodTypePage extends PageObject {

	public FoodTypePage(WebDriver driver, PageObject parent) {
		super(driver, parent);
	}

	public RestaurantPage clickOnRestaurant(String resturanName) {

		By byRestuarantTile = By.xpath("//h3[contains(text(),'" + resturanName +  "')]");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(byRestuarantTile));
		driver.findElement(byRestuarantTile).click();
		return new RestaurantPage(driver, null);
	}
}
