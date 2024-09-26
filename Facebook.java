package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sangeetha");
		driver.findElement(By.name("lastname")).sendKeys("Srinivasan");
		driver.findElement(By.name("reg_email__")).sendKeys("sangeethasenu@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Sangeetha@123");
		Select dropdown=new Select(driver.findElement(By.id("day")));
		dropdown.selectByIndex(8);
		Select dropdown1=new Select(driver.findElement(By.id("month")));
		dropdown1.selectByVisibleText("Oct");
		Select dropdown2=new Select(driver.findElement(By.id("year")));
		dropdown2.selectByValue("1992");
		driver.findElement(By.id("sex")).click();
		
		
		

	}

}
