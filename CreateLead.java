package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		WebElement login=driver.findElement(By.className("decorativeSubmit"));
        login.click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sangeetha");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Srinivasan");
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tech Lead");
        driver.findElement(By.name("submitButton")).click();
        
        String pagetitle =driver.getTitle();
        System.out.println("The title is"+pagetitle);
        
        Thread.sleep(3000);
        driver.close();
	}

}
