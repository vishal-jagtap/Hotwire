
package WebApp.TestProject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBuild {
	
	protected WebDriver driver;
		
	public void setup(){
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation_Project\\TestProject\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.hotwire.com/");
		//System.out.println(".........geturl");	
		
		
		}
	
		
}
	