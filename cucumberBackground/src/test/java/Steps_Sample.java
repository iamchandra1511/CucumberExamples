import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Steps_Sample 
{
	
	
	WebDriver driver;

	@Given("^Open Chrome browser$")
	public void open_Chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserNatives\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Then("^Navigate to Google Page$")
	public void navigate_to_Google_Page() throws Throwable {
		driver.get("https://google.com");
	}

	@Given("^search for chercher tech$")
	public void search_for_chercher_tech() throws Throwable {
		driver.findElement(By.name("q")).sendKeys("chercher tech");
	}

	@Given("^search for selenium cherchertech$")
	public void search_for_selenium_cherchertech() throws Throwable {
		driver.findElement(By.name("q")).sendKeys("selenium cherchertech");
	}

	@Given("^search for protractor chercher tech$")
	public void search_for_protractor_chercher_tech() throws Throwable {
		driver.findElement(By.name("q")).sendKeys("protractor chercher tech");
	}

}
