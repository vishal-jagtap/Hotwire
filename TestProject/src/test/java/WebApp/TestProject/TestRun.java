
package WebApp.TestProject;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRun extends TestBuild {

	@BeforeTest
	public void browser_open() throws IOException
	{		
		setup();
		
	}	
	
	@Test
	public void home_page() throws IOException
	{		
		Home_Page hp= new Home_Page();
		hp.TC_001(driver);
		
	}	
	@Test
	public void vactions_tab() throws IOException
	{		
		Vactions_Page hp= new Vactions_Page();
		hp.TC_002(driver);
		
	}	
}
