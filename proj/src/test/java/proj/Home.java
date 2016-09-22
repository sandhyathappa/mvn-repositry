package proj;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Home 
{
	WebDriver driver;
	public Home(WebDriver driver)
	{
		this.driver=driver;
		
	}
   public void open()
   {
	      //driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("https://login.yahoo.com"); 
   }
   
   public void login()
   {
	   open();
	   driver.findElement(By.id("login-username")).sendKeys("venkat123456a");
	   driver.findElement(By.name("signin")).click();
	   driver.findElement(By.id("login-passwd")).sendKeys("mq987654");
	   driver.findElement(By.id("login-signin")).click();;
	   
	   
   }
   
   public void createacc()
   {
	     open();
	    driver.findElement(By.id("login-signup")).click();
		driver.findElement(By.name("firstName")).sendKeys("sandhya");
		driver.findElement(By.name("lastName")).sendKeys("thappa");
		driver.findElement(By.name("yid")).sendKeys("nsandhya@");
		//String str=driver.findElement(By.xpath("//div[@id='reg-error-yid']")).getText();
		//System.out.println(str);
		driver.findElement(By.name("password")).sendKeys("12345789!2");
		//String str=driver.findElement(By.name("password")).sendKeys("12345").getText();
		//System.out.println(str);
	   new Select(driver.findElement(By.name("shortCountryCode"))).selectByValue("IN");
	   driver.findElement(By.name("phone")).sendKeys("8342051875");
	   new Select(driver.findElement(By.name("mm"))).selectByValue("5");
	   new Select(driver.findElement(By.name("dd"))).selectByValue("10");
	   new Select(driver.findElement(By.name("yyyy"))).selectByValue("2009");
	   new Select(driver.findElement(By.name("gender"))).selectByValue("female");
	   driver.findElement(By.id("reg-submit-button")).click();
	   
   }
   public void validate_links()
   {
	  open();
	   String exp[]={"Help"};
	   WebElement ui=driver.findElement(By.xpath("//ul[@class='Fl(end) Mend(10px) Lts(-0.31em) Tren(os) Whs(nw) My(6px)']"));
	   List<WebElement> li= ui.findElements(By.xpath("li/a/b"));
	   
	   for(int i=0;i<exp.length;i++)
	   {
		  if(exp[i].matches(li.get(i).getText())) 
		  {
			  System.out.println("correct");
		  }
		  
		  else
		  {
			  System.out.println("wrong");
		  }
		  }
	   }
}
   


}
