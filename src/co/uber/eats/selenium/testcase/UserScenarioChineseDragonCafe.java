package co.uber.eats.selenium.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import co.uber.eats.selenium.pageobject.home.HomePage;
import co.uber.eats.selenium.pageobject.quikoption.FoodTypePage;
import co.uber.eats.selenium.pageobject.resturant.RestaurantPage;
import co.uber.eats.selenium.pageobject.start.StartPage;

public class UserScenarioChineseDragonCafe {
	
	WebDriver driver;
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilwala\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);		
		
		driver.get("https://www.ubereats.com/lk");
		
		try {
			
			StartPage start = new StartPage(driver);
			
			HomePage home = start.searchFor("uoc").getSerachResults().clickOnItem(0);
			
			String quickOptionChinese = "Chinese";	
			
			FoodTypePage foodTypeViewChinese = home.clickQuickOption(quickOptionChinese);
	
			RestaurantPage restaurant = foodTypeViewChinese.clickOnRestaurant("Chinese Dragon Cafe");
			
			//Restaurant view
			restaurant.selectFoodItem("Sweet Corn Soup with Vegetables").choiseOfSize("Small").addOrder();
			restaurant.selectFoodItem("Basmati Steamed Rice").addOrder();
			restaurant.selectFoodItem("Hot Butter Mushroom").addOrder();
			restaurant.selectFoodItem("Chocolate Biscuit Pudding").addOrder();
			
			restaurant.viewCart().goToCheckout();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.close();
		}		
	}

	public static void main(String[] args) {
		new UserScenarioChineseDragonCafe().invokeBrowser();

	}
}