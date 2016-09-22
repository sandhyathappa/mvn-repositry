package proj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;

@Listeners({ATUReportsListener.class,ConfigurationListener.class,MethodListener.class })
public class sanitytest 
{
	WebDriver driver;
	{
		System.setProperty("atu.report.config", "C:\\eclipse proram\\atu.properties");
	}
	@Test
	@Parameters({"browser"})
public void sanitytest(String br) throws Exception
  {
   if(br.matches("Chrome"))
   {
	   System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
	   driver=new ChromeDriver();
   }

   Home h=new Home(driver);
   h.login();
   
   compose c=new compose(driver);
   c.sendmail();
   c.signout();
   
   
   }

}
