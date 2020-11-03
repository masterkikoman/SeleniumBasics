import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSample {

	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalmazan\\AutomationDrivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			//Facebook Scenario
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys("Hello");
			driver.findElement(By.name("pass")).sendKeys("World");
			driver.findElement(By.linkText("Forgot Password?")).click(); 
			
			
			//Using CSS Selector`
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.cssSelector("#email")).sendKeys("Hello");
			driver.findElement(By.cssSelector("#pass")).sendKeys("World");
			driver.findElement(By.cssSelector("#u_0_a > div._6ltj > a")).click();
			
			
			//Using Xpath
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Hello");
			driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("World");
			driver.findElement(By.xpath("//*[@id='u_0_a']/div[3]/a")).click();
			driver.quit();
				

	}
}
