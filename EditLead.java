package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http:leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		WebElement login=driver.findElement(By.className("decorativeSubmit"));
		login.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sangeetha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Srinivasan");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Mani");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Accounts");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing Description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sangeethasenu@gmail.com");
		Select dropdown=new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		dropdown.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important");
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(3000);
		driver.close();
	}

}
