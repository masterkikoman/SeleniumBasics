import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParentChildXpathRelation {

	public static void main(String[] args) {
		//parent Child relation xpath
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalmazan\\AutomationDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//relative xpath
		driver.findElement(By.xpath("//*[@class='SDkEP']/div[2]/input")).sendKeys("google translate");
		//sibling xpath
		driver.findElement(By.xpath("//*[@jscontroller='iDPoPb']/style/following-sibling::input")).sendKeys(Keys.ENTER);
		//absolute xpath
		//driver.findElement(By.xpath("//div/form/div[2]/div/div[3]/center/input"));
		driver.findElement(By.id("tw-source-text-ta")).sendKeys("Hello World");
		
		//parent xpath
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@class='tw-menu-btn-image z1asCe JKu1je']/parent::span")))).click();
	
		
		

	}

}
