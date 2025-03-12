package StepDefinition;

import org.testng.Assert;
import Browser.browser;
import Pages.page1;
import io.cucumber.java.en.*;

public class Sample1Scenario {
    
    @Given("User opens the Browser")
    public void user_opens_the_browser() {
        browser.openBrowser();
    }

    @And("User navigates to {string} the webpage")
    public void user_navigates_to_the_webpage(String url) {
        browser.navigateToUrl(url);
    }
    
    @Then("User verifies the title of web page")
    public void user_verifies_the_title_of_web_page() {
        Assert.assertEquals(page1.Title(), "OrangeHRM");
    }
    
    @And("User closes the browser")
    public void user_closes_the_browser() {
        browser.closeBrowser();
    }
}



/*
package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sample1Scenario {

    WebDriver driver;

    @Given("User opens the Browser")
    public void user_opens_the_browser() {
        WebDriverManager.chromedriver().setup(); // Automatically setup ChromeDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("User navigates to the {string} webpage")
    public void user_navigates_to_the_webpage(String url) {
        driver.get(url);
    }

    @Then("User verifies the title of the page")
    public void user_verifies_the_title_of_the_page() {
        String expectedTitle = "OrangeHRM";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
    }

    @Then("User closes the Browser")
    public void user_closes_the_browser() {
        if (driver != null) {
            driver.quit();
        }
    }
}


*/