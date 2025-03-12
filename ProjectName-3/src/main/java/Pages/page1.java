
package Pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Browser.browser;
import Locators.page1Objects;

public class page1 {
    
    static page1Objects obj;
    
    public static String Title() {
        return browser.driver.getTitle();
    }
    
    public static void enterusername(String str) {
        try {
            browser.wait = new WebDriverWait(browser.driver, Duration.ofSeconds(20));
            browser.wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
            obj = new page1Objects();
            obj.userName.sendKeys(str);
        } catch (Exception e) {
            System.out.println("Username :" + e);
        }
    }
    
    public static void enterpassword(String str) {
        try {
            obj.password.sendKeys(str);
        } catch (Exception e) {
            System.out.println("Password :" + e);
        }
    }
    
    public static void click() {
        try {
            obj.loginbutton.click();
        } catch (Exception e) {
            System.out.println("Click :" + e);
        }
    }
}



/*
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class page1 {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(name = "username") // Locator for the username field
    WebElement usernameField;

    @FindBy(name = "password") // Locator for the password field
    WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']") // Locator for the login button
    WebElement loginButton;

    @FindBy(xpath = "//h6[contains(text(),'Dashboard')]") // Locator for the dashboard heading
    WebElement dashboardHeading;

    public page1(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Initialize WebDriverWait
        PageFactory.initElements(driver, this); // Initialize PageFactory
    }

    // Method to enter username
    public void enterUserName(String username) {
        wait.until(ExpectedConditions.visibilityOf(usernameField)).sendKeys(username);
    }

    // Method to enter password
    public void enterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
    }

    // Method to click the login button
    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    // Method to get the page title
    public String getTitle() {
        return driver.getTitle();
    }

    // Method to check if the dashboard is visible
    public boolean isDashboardVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(dashboardHeading)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}

*/

/*
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.browser;

import java.time.Duration;

public class page1 extends browser {
    WebDriver driver;
    WebDriverWait wait;

    // Locating elements using correct selectors
    @FindBy(xpath = "//input[@name='username']")  // Ensure this matches your page's structure
    WebElement usernameField;

    @FindBy(xpath = "//input[@name='password']")  // Ensure this matches your page's structure
    WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")  
    WebElement loginButton;

    @FindBy(xpath = "//h6[contains(text(),'Dashboard')]")  // Ensure this matches your page
    WebElement dashboardHeading;

    // Constructor
    public page1(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Set a default wait
        PageFactory.initElements(driver, this);
    }

    // Get page title
    public String getTitle() {
        return driver.getTitle();
    }

    // Login method with explicit waits
    public void login(String username, String password) {
        wait.until(ExpectedConditions.visibilityOf(usernameField)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    // Methods to interact with elements safely
    public void enterUserName(String username) {
        wait.until(ExpectedConditions.visibilityOf(usernameField)).sendKeys(username);
    }

    public void enterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
    }

    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    // Check if the dashboard is visible after login
    public boolean isDashboardVisible() {
        try {
            return wait.until(ExpectedConditions.visibilityOf(dashboardHeading)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}

*/






/*
package Pages;

import org.openqa.selenium.support.ui.ExpectedConditions;

import Browser.browser;
import Locators.page1Objects;

public class page1 extends browser {
	
	// Script related to action performed in first page(Login)
	
	
	public static void enterUserName(String user) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(page1Objects.username()));
			page1Objects.username().sendKeys(user);
		} catch(Exception e) {
			System.out.println("Error! username: "+e.getMessage());
		}
	}
	
	
	public static void enterpassword(String pass) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(page1Objects.password()));
			page1Objects.password().sendKeys(pass);
		} catch(Exception e) {
			System.out.println("Error! password: "+e.getMessage());
		}
	}
	
	
	 public static void clickLogin() {
	        try {
	            wait.until(ExpectedConditions.elementToBeClickable(page1Objects.loginBtn()));
	            page1Objects.loginBtn().click();
	        } catch (Exception e) {
	            System.out.println("Error clicking login button: " + e.getMessage());
	        }
	 }
	 
	 public static String getTitle() {
		 return driver.getTitle();
	 }
	 
	 */

//	public static void userNameEnter() {
//		try {
//			WebElement userField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
//            userField.clear();
//            userField.sendKeys("Admin");
//        } catch (Exception e) {
//            System.out.println("Error: Unable to enter username - " + e.getMessage());
//        }
//	}
//	
//	public static void passwordEnter() {
//		try {
//			WebElement passField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
//            passField.clear();
//            passField.sendKeys("admin123"); // Hardcoded Password
//        } catch (Exception e) {
//            System.out.println("Error: Unable to enter password - " + e.getMessage());
//        }
//	}
//	
//	public static void clickLogin() {
//		try {
//			 WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
//	            loginButton.click();
//	        } catch (Exception e) {
//	            System.out.println("Error: Unable to click login button - " + e.getMessage());
//	        }
//	}


