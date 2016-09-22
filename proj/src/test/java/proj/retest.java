package proj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;


@Listeners({ATUReportsListener.class,ConfigurationListener.class,MethodListener.class })
public class retest 
{
	 WebDriver driver;
	  @Test
	  @Parameters({"browser"})
		public void restest(String br) throws Exception
		{
			if(br.matches("ie"))
			{
				
				Thread.sleep(3000);
				 System.setProperty("webdriver.ie.driver","C:\\IEDriverServer.exe" );
				   driver=new InternetExplorerDriver();
			}
			
		if(br.matches("Chrome"))
		{
			
			Thread.sleep(6000);
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
			   driver=new ChromeDriver();
		}
		 
		Home h= new Home(driver);
		h.validate_links();
		h.createacc();
		h.login();
		
		inbox i=new inbox(driver);
		i.deletemail();
		
		compose1 c1= new compose1(driver);
		c1.sendmail();
		c1.signout();
		driver.quit();
		
		
			
		}
}
