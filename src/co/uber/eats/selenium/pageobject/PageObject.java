package co.uber.eats.selenium.pageobject;

import org.openqa.selenium.WebDriver;

public class PageObject {
	protected WebDriver driver;
	protected PageObject parent;	
	
	public PageObject(WebDriver driver, PageObject parent) {
		super();
		this.driver = driver;
		this.parent = parent;
		quickValidate();
	}

	protected void quickValidate() {}
}