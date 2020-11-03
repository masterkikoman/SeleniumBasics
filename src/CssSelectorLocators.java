import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocators {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalmazan\\AutomationDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("Hello");
		driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 password']")).sendKeys("World");
		driver.findElement(By.cssSelector("input[class='button r4 wide primary']")).click();
		
	}
 
}
