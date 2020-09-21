import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Steps_Sample {
	WebDriver driver;
	
	
	
	//@Given("^I am on the Home Page \"([^\"]*)\" of CarsGuide Website$")
	
	@Given("^There is opened \"([^\"]*)\"$")
//	@Given("^I am on the Home Page \"([^\"]*)\" of CarsGuide Website$")
	public void there_is_opened_Chrome_browser(String browser) throws Throwable
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\BrowserNatives\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://google.com");
		}
		else if(browser.equals("firefox")) 
		{
			System.setProperty("webdriver.firefox.driver", "D:\\BrowserNatives\\chromedriver.exe");
			driver = new FirefoxDriver();
		}

		//driver.get("https://google.com");
		System.out.println("Opening "+browser);
	}
	@When("^I searched \"([^\"]*)\" in searchbar$")
	public void i_searched_Chercher_Tech_in_searchbar(String searchTerm) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserNatives\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.findElement(By.name("q")).sendKeys(searchTerm);
		System.out.println("Searching the text on search bar");
	}
	
	
}