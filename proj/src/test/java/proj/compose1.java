package proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;

@Listeners({ATUReportsListener.class,ConfigurationListener.class,MethodListener.class })
public class compose1 
{
	WebDriver driver;
	{
		System.setProperty("atu.report.config", "C:\\eclipse proram\\atu.properties");
	}
	public compose1(WebDriver driver)
	{
		this.driver=driver;
	}
   public void sendmail()
   {
	   //driver.findElement(By.xpath("//a[@id='yucs-mail_link_id']")).click();
	   driver.findElement(By.xpath("//input[@class='composeicon']")).click();
	   driver.findElement(By.id("to")).sendKeys("vijayakullar");
	   driver.findElement(By.id("Subj")).sendKeys("hiiii");
	   driver.findElement(By.id("send_bottom")).click();
   }
   
   public void signout()
   {
	   driver.findElement(By.linkText("Sign Out")).click();
	   
   }
}
