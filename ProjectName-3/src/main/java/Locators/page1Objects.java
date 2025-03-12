package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Browser.browser;

public class page1Objects extends browser {
    
    public page1Objects() {
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(name="username")
    public WebElement userName;
    
    @FindBy(name="password")
    public WebElement password;
    
    @FindBy(css="[type=\"submit\"]")
    public WebElement loginbutton;
}





/*
package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Browser.browser;

public class page1Objects extends browser {
    static By userNameField = By.name("username");
    static By passwordField = By.name("password");
    static By loginButton = By.xpath("//button[@type='submit']");

    public static WebElement username() {
        return driver.findElement(userNameField);
    }

    public static WebElement password() {
        return driver.findElement(passwordField);
    }

    public static WebElement loginBtn() {
        return driver.findElement(loginButton);
    }
}

*/

/*
package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browser.browser;

public class page1Objects extends browser {
	
	static By userNameField  = By.name("username");
	static By passwordField  = By.name("password");
	static By loginButton    = By.xpath("//button[@type='submit']");
	
	public static  WebElement username() {
		WebElement  element  = driver.findElement(userNameField);
		return element;
	}
	
	public static WebElement password() {
		WebElement element1 = driver.findElement(passwordField);
		return element1;
	}
	
	public static WebElement loginBtn() {
		WebElement element2  = driver.findElement(loginButton);
		return element2;
	}
}
	
*/
	
	
//	static By searchTextBox = By.id("APjFqb");
//	/*
//	 * Method to get element of search text box and store it
//	 */
//	public static WebElement textBox() {
//		WebElement element = driver.findElement(searchTextBox);
//		return element;
//	}
//	
//	public static void searchTextBox(String data) throws IOException {
//		try {
//			wait.until(ExpectedConditions.elementToBeClickable(Page1Objects.textBox()));
//			Page1Objects.textBox().sendKeys(data);
//
//		} catch (Exception e) {
//			System.out.println("Page1 - searchTextBox");
//		}
//	}
//	
	
	

