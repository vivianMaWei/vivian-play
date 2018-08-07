package vvstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetcher {
	private WebDriver driver;

	

	public static void main(String[] args) {
		Fetcher fetcher = new Fetcher();
		fetcher.brandLogin();
	}

	public void brandLogin() {
		// 设置firefox浏览器的位置
		System.setProperty("webdriver.gecko.driver", "/Users/vivian/Downloads/geckodriver");

		// 创建WebDriver对象
		driver = new FirefoxDriver();
	
		driver.get("https://www.baidu.com");
	
		driver.manage().window().maximize();



		// 获取输入框的id,并在输入框中输入用户名
//		WebElement loginInput = driver.findElement(By.id("uname"));
//		loginInput.sendKeys("输入网站的用户名");
//
//		// 获取输入框的id，并在输入框中输入密码
//		WebElement pwdInput = driver.findElement(By.id("upwd"));
//		pwdInput.sendKeys("输入网站的密码");
//
//		// 获取登陆按钮的className，并点击
//		WebElement loginBtn = driver.findElement(By.className("LBtn"));
//		loginBtn.click();
		
		driver.quit();
	}
}