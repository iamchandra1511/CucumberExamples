import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps_Sample {
	WebDriver driver;
	@Given("^There is opened \"([^\"]*)\"$")
	public void there_is_opened_Chrome_browser(String browser) throws Throwable {
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\BrowserNatives\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://google.com");
			System.out.println("Opening "+browser);
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://google.com");
			System.out.println("Opening "+browser);
		}

		
	}
	@When("^I searched \"([^\"]*)\" in searchbar$")
	public void i_searched_Chercher_Tech_in_searchbar(String searchTerm) throws Throwable {
		driver.findElement(By.name("q")).sendKeys(searchTerm);
		System.out.println("Searching the text on search bar");
	}
	@When("^When I press Enter key$")
	public void when_I_press_Enter_key() throws Throwable {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("Press Enter key");
	}
	@Then("^I should see results$")
	public void i_should_see_Chercher_Tech_results() throws Throwable {
		driver.findElement(By.partialLinkText("CherCher"));
		System.out.println("User should see results relate to CherCher Tech");
	}
	@Then("^I click on the First result to see the Home page$")
	public void i_click_on_the_First_result_to_see_the_Home_page() throws Throwable {
		driver.findElement(By.partialLinkText("CherCher")).click();
		System.out.println("User should able to click first link");
	}
}