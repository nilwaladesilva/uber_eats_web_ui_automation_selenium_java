package co.uber.eats.selenium.pageobject.resturant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import co.uber.eats.selenium.pageobject.PageObject;

public class CartPopUp extends PageObject {

	public CartPopUp(WebDriver driver, PageObject parent) {
		super(driver, parent);
	}

	@Override
	protected void quickValidate() {
		By byRestuarantTile = By.xpath("//div/a[contains(text(),'Go to checkout')]");
		WebDriverWait wait = new WebDriverWait(driver, 1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(byRestuarantTile));
	}
	
	public void goToCheckout() {
		driver.findElement(By.xpath("//div/a[contains(text(),'Go to checkout')]")).click();
	} 
}