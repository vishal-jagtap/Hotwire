/*
 @author vishal.jagtap
  ProjectName- Hotwire
  Vacation Page	
*/

package WebApp.TestProject;



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Vactions_Page {


	By car = By.xpath("//button[contains(text(),'Car')]");
	By fly_from = By.xpath("//input[@id='farefinder-package-origin-location-input']");
	By fly_to = By.xpath("//input[@id='farefinder-package-destination-location-input']");
	By SFO = By.partialLinkText("San Francisco, CA, U");
	By LAX = By.partialLinkText("Los Angeles, CA, Uni");
	By Departing =By.xpath("//input[@id='farefinder-package-startdate-input']");
	By Departing_time = By.xpath("//select[@id='farefinder-package-pickuptime-input']");
	By Returning =By.xpath("//input[@id='farefinder-package-enddate-input']");
	By Returning_time = By.xpath("//select[@id='farefinder-package-dropofftime-input']");
	By Find_Deal = By.xpath("//button[@id='farefinder-package-search-button']");
	
	
	
	public void TC_002(WebDriver driver){
		
		
		WebElement Car_option= driver.findElement(car);
		Car_option.click();
		
		WebElement FlyFrom= driver.findElement(fly_from);
		FlyFrom.sendKeys("SFO");
		
		WebElement SFO_Select= driver.findElement(SFO);
		Actions builder = new Actions(driver);
        builder.moveToElement(SFO_Select).click().perform();
                
      
        WebElement FlyTo= driver.findElement(fly_to);
		FlyTo.sendKeys("LAX");
		
		WebElement LAX_Select= driver.findElement(LAX);
		Actions builder1 = new Actions(driver);
        builder1.moveToElement(LAX_Select).click().perform();
        
		
		Date dt = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dt);
		calendar.add(Calendar.DATE, 1);
		dt = calendar.getTime();
		 
		String tommorowsDate = new SimpleDateFormat("MM/dd/yyyy").format(dt);
		System.out.println("Next date:"+tommorowsDate);
		
		WebElement dept= driver.findElement(Departing);
		dept.clear();
		dept.sendKeys(tommorowsDate);
		
		calendar.add(Calendar.DATE, 21);
		dt = calendar.getTime();
		String Enddate = new SimpleDateFormat("MM/dd/yyyy").format(dt);
		System.out.println("After three weeks:"+Enddate);
		
		WebElement retrun= driver.findElement(Returning);
		retrun.clear();
		retrun.sendKeys(Enddate);
		
		WebElement dept_time= driver.findElement(Departing_time);
		dept_time.sendKeys("Evening");
		 
		WebElement return_time= driver.findElement(Returning_time);
		return_time.sendKeys("Morning");
	
		WebElement find_deal= driver.findElement(Find_Deal);
		find_deal.click();
		
		
				
		
	}
	

}
