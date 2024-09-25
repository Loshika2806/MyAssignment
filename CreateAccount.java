package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	private static final By By = null;

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		WebElement login=driver.findElement(By.className("decorativeSubmit"));
        login.click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Accounts")).click();
        
        Thread.sleep(3000);
        driver.findElement(By.linkText("Create Account")).click();
        driver.findElement(By.id("accountName")).sendKeys("Sangeetha09101994");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        driver.findElement(By.name("numberEmployees")).sendKeys("10");
        Thread.sleep(3000);
        driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
        driver.findElement(By.className("smallSubmit")).click();
        Thread.sleep(3000);
        String pagetitle =driver.getTitle();
        System.out.println("The title is"+pagetitle);
        
        Thread.sleep(3000);
        driver.close();
	}
}
       
   

        
        
        
        
	


