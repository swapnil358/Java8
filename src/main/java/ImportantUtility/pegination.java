package ImportantUtility;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pegination {

	@Test
	public void pegination1() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Kids']/parent::div"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		
		
		
	//	driver.findElement(By.xpath("//a[text()='Nike']/parent::li")).click();

	//	WebElement totalCount = driver.findElement(By.className("title-count"));
	//	System.out.println(totalCount.getText().split(" ")[2]);
		
//		WebElement nextButton = driver.findElement(By.className("pagination-arrowRight"));
//		//driver.navigate().refresh();
//		List<WebElement> listOfProduct = driver.findElements(By.xpath("//li[@class='product-base']//a//descendant::div[@class='product-productMetaInfo']//h4[@class='product-product']"));
//		List<String> ls = new ArrayList<>();
//		
//		for(WebElement ele : listOfProduct) {
//			ls.add(ele.getText());
//			
//		}
//		System.out.println("*******************************");
//
//		while(true) {
//			JavascriptExecutor js = (JavascriptExecutor)driver;
//			js.executeScript("arguments[0].scrollIntoView(true);"+"window.scrollBy(0,-100);", nextButton);
//			
//			nextButton.click();
//	
//			for(WebElement ele : listOfProduct) {
//				ls.add(ele.getText());
//				
//			}
//			System.out.println("*******************************");
//			
//			try {
//				driver.findElement(By.className("pagination-arrowRight"));
//			}catch(Exception e){
//				System.out.println("no product available");
//				break;
//			}
//			
//			
//			System.out.println("*******************************");
//
//			
//		}
//		
		
		
	}

}
