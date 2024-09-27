package marathonsection;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" https://www.amazon.in");	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']")).click();
		String totalResult = driver.findElement(By.xpath("//span[contains(text(),'result')]")).getText();
		System.out.println("Total Result: "+totalResult);
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i[@class='a-icon a-icon-checkbox'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i[@class='a-icon a-icon-checkbox'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Featured']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		String bagName = driver.findElement(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']//div[@class='sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20'][1]//span[@class='a-size-base-plus a-color-base a-text-normal']")).getText();
		System.out.println("Bag Name: "+bagName);
		
		String discoutPrice = driver.findElement(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']//div[@class='sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20'][1]//span[@class='a-price-whole']")).getText();
		System.out.println("Discount Price: "+discoutPrice);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(3000);
		driver.close();
	}

}
