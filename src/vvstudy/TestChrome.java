package vvstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestChrome {

	public static void main(String[] args) {
        String URL="https://mail.qq.com/";
       
        System.setProperty("webdriver.chrome.driver", "/Users/vivian/Documents/automation/chromedriver");  
        WebDriver driver = new ChromeDriver();
       
        driver.get(URL);
    
        driver.manage().window().maximize(); 
        
		driver.switchTo().frame(driver.findElement(By.id("login_frame")));

		WebElement useName = driver.findElement(By.id("u"));
        			
		Actions actions=new Actions(driver);		
		
		actions.contextClick(useName).build().perform();

	}

}
