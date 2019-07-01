package actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost:8080/login.do");
		Thread.sleep(2000);
		
		System.out.println("Welcome page title : "+driver.getTitle());
		
		WebElement un = driver.findElement(By.name("username"));
		un.sendKeys("admin");

		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.sendKeys("manager",Keys.ENTER);
		Thread.sleep(1000);
		
		System.out.println("Home page title : "+driver.getTitle());
		Thread.sleep(2000);
		
		WebElement logout = driver.findElement(By.id("logoutLink"));
		logout.click();
		
	}

}
