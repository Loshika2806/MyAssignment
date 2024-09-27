package marathonsection;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.support.ui.Select;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
	 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.pvrcinemas.com/");
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='cinema']")).click();
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Book']")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.xpath("//span[@id='CL.CLUB|H:7']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		String seatInfo = driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
		System.out.println("Seat Number: "+seatInfo);
		String grandTotal = driver.findElement(By.xpath("(//div[contains(@class,'grand-tota')])[3]//h6[2]")).getText();
		System.out.println("Grand Total: "+grandTotal);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//div[contains(@class,'cross-icon')][1]"));
		driver.executeScript("arguments[0].click();", element);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(3000);
		driver.close();
	}

}
