package vvstudy;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.JavascriptExecutor;


public class TestEmail {
	private WebDriver driver;
	public static void main(String[] args) {
		TestEmail TestEmail = new TestEmail();
		TestEmail.Login();
		TestEmail.replyAll();
	}

	private void replyAll() {
		

	}

	public void Login() {

		System.setProperty("webdriver.gecko.driver", "/Users/vivian/Downloads/geckodriver");

		driver = new FirefoxDriver();

		driver.get("https://mail.qq.com/");

		// driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.id("login_frame")));

		pause(3);

		WebElement usename = driver.findElement(By.id("u"));
		
		WebElement loginBtn = driver.findElement(By.id("login_button"));
	    
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    
		js.executeScript("arguments[0].scrollIntoView(true);",	 loginBtn);
	    
		Actions actions=new Actions(driver);		
		
		actions.moveToElement(loginBtn).contextClick().build().perform();
		
		
//		actions.keyDown(Keys.CONTROL).click().build().perform();
		
//		actions.contextClick(loginBtn).build().perform();
//		actions.click(loginBtn).build().perform();;
//		actions.doubleClick(loginBtn).build().perform();
//		actions.clickAndHold();

//		usename.click();
//		usename.clear();
//		pause(1);
//		usename.sendKeys("66227529");
//		pause(3);
//		WebElement pwdInput = driver.findElement(By.id("p"));
//		Actions actions=new Actions(driver);
////		actions.contextClick(pwdInput).build().perform();
//		pause(5);
//		
//		
//		
//		pwdInput.sendKeys("198127mW");
//
//		pause(5);
//
////		WebElement loginBtn = driver.findElement(By.id("login_button"));
////		loginBtn.click();
////		pause(5);
////		
////	//	WebElement tootip = driver.findElement(By.xpath("//a[@id='setAliasTipclosetemporary']/span"));
////	//	tootip.click();
////	
////		WebElement inbox = driver.findElement(By.xpath("//a[@id='folder_1']"));
////		
////		//WebElement inbox = driver.findElement(By.xpath(".//*[@id='readmailbtn_link']"));
////		inbox.click();
////		pause(8);
//		driver.quit();
	}

	public void pause(int s) {
		try {
			Thread.sleep(s * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
