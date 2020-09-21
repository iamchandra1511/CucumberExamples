import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Steps_Sample {
	WebDriver driver;

	@Given("^There is opened Google$")
	public void there_is_opened_Google() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserNatives\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://google.com");
	}

	@Then("^I search ChercherTech in searchbar$")
	public void i_search_ChercherTech_in_searchbar() throws Throwable {
	    driver.findElement(By.name("q")).sendKeys("CherCherTech");
	}
}