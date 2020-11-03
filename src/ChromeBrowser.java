import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1st Step: Create Driver Object
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalmazan\\AutomationDrivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			//get title
			System.out.println(driver.getTitle());//Helps validate if your page title is correct
			System.out.println(driver.getCurrentUrl());//Helps validate if your page landed on correct URL
			System.out.println(driver.getPageSource());//sample scenario if right click is disabled/page source
			driver.findElement(By.id("source")).sendKeys("hello");
			driver.findElement(By.xpath("//div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[5]/div[3]/div[2]")).click();
			/*driver.get("http://yahoo.com");
			driver.navigate().back();
			driver.close();//closing current brow
			driver.quit();//closing browser opened by selenium script*/
			
			
			

	}

}
