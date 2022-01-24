package co.uber.eats.selenium.pageobject.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import co.uber.eats.selenium.pageobject.PageObject;
import co.uber.eats.selenium.pageobject.quikoption.FoodTypePage;

public class HomePage extends PageObject {

	public HomePage(WebDriver driver, PageObject parent) {
		super(driver, parent);
	}
	
	@Override
	protected void quickValidate() {
		By byRestuarantTile = By.xpath("//*[@id=\"wrapper\"]/header/div/div/a[1]/img");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(byRestuarantTile));
	}
	
	public boolean isQuickOptionExist(String categoryName) {
		//TODO implement the logic
		return true;
	}
	
	public FoodTypePage clickQuickOption(String optionName) {
		//Order food online page
		driver.findElement(By.xpath("//span/div[contains(text(),'" + optionName + "')]")).click();
		return new FoodTypePage(driver, null);
	}
}