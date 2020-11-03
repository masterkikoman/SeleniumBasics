import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddit {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalmazan\\AutomationDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Customize xpath and css locator regular expression
		driver.get("https://www.reddit.com/"); //Opens the URL
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@href,'login')]")).click();
		
		//Changing IFRAME using element
		WebElement iframeElement = driver.findElement(By.xpath("//iframe[@src ='https://www.reddit.com/login/']"));
		driver.switchTo().frame(iframeElement);
		driver.findElement(By.id("loginUsername")).sendKeys("Hello");
		driver.switchTo().defaultContent();
		//driver.quit();
		
	} 
}
