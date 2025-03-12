package StepDefinition;

import org.testng.Assert;
import Pages.page1;
import Pages.page2;
import io.cucumber.java.en.*;

public class Sample2Scenario {

    @When("User Enters {string} username")
    public void user_enters_username(String username) throws InterruptedException {
        page1.enterusername(username);
    }

    @And("User Enters {string} password")
    public void user_enters_password(String password) {
        page1.enterpassword(password);
    }

    @And("User Clicks login button")
    public void user_clicks_login_button() {
        page1.click();
    }

    @Then("User checks the functionality of login")
    public void user_checks_the_functionality_of_login() throws InterruptedException {
        // Update the expected username to match the actual username displayed on the application
        Assert.assertEquals(page2.Username(), "Nilesh Kumar", "Login failed: Username mismatch");
    }
}



/*
package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sample2Scenario {

    WebDriver driver;

    @Given("User opens the browser")
    public void user_opens_the_browser() {
        WebDriverManager.chromedriver().setup(); // Automatically setup ChromeDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    
    
    
    

    @When("User enters {string} as the username")
    public void user_enters_the_username(String username) {
        driver.findElement(By.name("username")).sendKeys(username);
    }

    @When("User enters {string} as the password")
    public void user_enters_the_password(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @When("User clicks on the Login button")
    public void user_clicks_on_the_login_button() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("User verifies the profile account")
    public void user_verifies_the_profile_account() {
        String expectedUrl = "dashboard";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl), "Login failed! Dashboard not loaded.");
    }

    @Then("user closes the Browser")
    public void user_closes_the_browser() {
        if (driver != null) {
            driver.quit();
        }
    }
}

*/