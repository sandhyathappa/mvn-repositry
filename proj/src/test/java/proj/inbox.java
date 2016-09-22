package proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class inbox 
{
WebDriver driver;
	
	public inbox(WebDriver driver)
	{
		this.driver=driver;
	}
  public void deletemail()throws Exception
  {
	  driver.findElement(By.xpath("//a[@id='yucs-mail_link_id']")).click();
	  driver.findElement(By.xpath("//input[@name='mid'])[position()=3]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("top_delete")).click();
  }
}
