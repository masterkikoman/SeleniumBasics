import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1st Step: Create Driver Object
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\kalmazan\\AutomationDrivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://google.com");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			

	}

}
