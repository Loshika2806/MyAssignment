package week3day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {

	public static void main(String[] args) throws InterruptedException {
		//Launching the URL https://www.ajio.com/
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
		//In the search box, typing as "bags" and pressing enter
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		Thread.sleep(3000);
		
		//To the left of the screen under "Gender" clicking on "Men" option
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		
		//Under "Category" clicking on "Fashion Bags" option
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(3000);
		
		//Printing the count of the items found.
		String itemsfound = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(itemsfound);
		
		//Printing list of brands
		driver.findElement(By.xpath("//span[text()='brands']")).click();

		List<WebElement> lisfOfBrands = driver.findElements(By.xpath("//label[contains(@class,'brand')]"));
		int brandCounts =lisfOfBrands.size();
		System.out.println("Total Brands Count:"+brandCounts);
		System.out.println("List of Brands:");
		for (int i=0; i < lisfOfBrands.size(); i++) {
			System.out.println(lisfOfBrands.get(i).getText());
		}
		
		//Printing Name list of bags
		List<WebElement> lisfOfBagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
		int noOfBags =lisfOfBagNames.size();
		System.out.println("Total Bags Count:"+noOfBags);
		System.out.println("List of Bag Names:");
		for (int i=0; i < lisfOfBagNames.size(); i++) {
			System.out.println(lisfOfBagNames.get(i).getText());
		}
	
	}
}

