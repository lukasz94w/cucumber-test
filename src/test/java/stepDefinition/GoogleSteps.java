package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSteps {

    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {
        System.setProperty("webdriver.chrome.driver", "/home/luke/IdeaProjects/selenium-test/src/test/resources/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Given("user is on google search page")
    public void user_is_on_google_search_page() {
        driver.navigate().to("https://google.com");
        driver.findElement(By.id("L2AGLb")).click(); // accept cookies
    }
    @When("user enter a text in search box")
    public void user_enter_a_text_in_search_box() {
        driver.findElement(By.name("q")).sendKeys("Automation step by step");
    }
    @When("hits enter")
    public void hits_enter() {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        Assert.assertTrue(driver.getPageSource().contains("Online Courses"));
        driver.close();
        driver.quit();
    }
}
