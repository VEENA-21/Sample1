
package Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Browser.browser;
import Locators.page2Object;

public class page2 {

    public static page2Object obj;

    public static String Username() throws InterruptedException {
        obj = new page2Object();
        browser.wait = new WebDriverWait(browser.driver, Duration.ofSeconds(20));
        browser.wait.until(ExpectedConditions.elementToBeClickable(obj.dashboardelement));
        return obj.dashboardelement.getText();
    }

    public static void optionclick(String str) {
        try {
            for (WebElement e : obj.list) {
                if (e.getText().equalsIgnoreCase(str)) {
                    e.click();
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Click :" + e);
        }
    }
}




/*
package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v114.browser.Browser;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.browser;
import Locators.page2Object;

public class page2 extends browser {
	
		public static page2Object obj;
		
		
		public static String Username() throws InterruptedException
		{
			obj=new page2Object();
			 wait=new WebDriverWait(Browser.driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(obj.dashboardelement));
			
			return obj.dashboardelement.getText();
		}
	
		//clicking method
	
		public static void optionclick(String str) 
		{
			try{
				for(WebElement e:obj.list)
				{
					if(e.getText().equalsIgnoreCase(str))
					{	e.click();
						break; }
				}
				}
			
			catch(Exception E)
			{
				System.out.println("Click :"+E);
			}
		}
}


*/




/*
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Page2 {
    WebDriver driver;

    public Page2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectOperation() {
        List<WebElement> list = driver.findElements(By.xpath("//ul[@class='oxd-main-menu']/li"));
        for (WebElement element : list) {
            if (element.getText().equalsIgnoreCase("Leave")) {
                element.click();
                break;
            }
        }
    }
}

*/


/*
package Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import Browser.browser;

public class Page2 extends browser {

    public Page2(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

  
	public static void selectOperation() {
        // Locate all menu items
        List<WebElement> list = driver.findElements(By.xpath("//ul[@class='oxd-main-menu']/li"));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().equalsIgnoreCase("Leave")) {
                list.get(i).click();
                break; // Stop loop after clicking "Leave"
            }
        }
    }
}

*/

//public class Page2 extends browser{
//	static PageObject2 obj;
//	
//	public static void select(String data) {
//		obj = PageFactory.initElements(driver, PageObject2.class);
//		
//		wait.until(ExpectedConditions.elementToBeClickable(obj.element));
//		for(int i = 0;i<obj.list.size();i++) {
//			System.out.println(obj.list.get(i).getAttribute("href"));
//			if(obj.list.get(i).getAttribute("href").equalsIgnoreCase(data));
//			{
//				obj.list.get(i).click();
//			}
//		}
//	}
