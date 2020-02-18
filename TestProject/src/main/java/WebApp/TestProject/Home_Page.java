/*
 @author vishal.jagtap
  ProjectName- Hotwire
  Home Page	
*/

package WebApp.TestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {

	
	By vacations = By.xpath("//li[@class='hidden-xs']//a[contains(text(),'Vacations')]");
	
	public void TC_001(WebDriver driver){
		
		WebElement Vaction_Tab= driver.findElement(vacations);
		Vaction_Tab.click();;
	}
}
