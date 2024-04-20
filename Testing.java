package WebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Testing {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "...\\Selenium\\Java\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		
		WebElement username = driver.findElement(By.id("username"));
		username.isDisplayed();
		username.isEnabled();
		username.sendKeys("tomsmith");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.isDisplayed();
		pwd.isEnabled();
		pwd.sendKeys("SuperSecretPassword!");
		
		WebElement login = driver.findElement(By.cssSelector("button[type='submit']"));
		login.isDisplayed();
		login.isEnabled();
		login.click();
		
		String s = driver.findElement(By.cssSelector("div")).getText();
		System.out.println(s);
	}

}
