package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HorizontalScroll {

	
	static WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.google.com");

		Thread.sleep(2000);
		driver.get("https://rangeslider.js.org/"); // https://the-internet.herokuapp.com/horizontal_slider

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void teaDown() throws InterruptedException {
		driver.quit();
	}

	@Test
	public static void ScrollLeft(String offSet) throws InterruptedException {

		WebElement slider = driver.findElement(By.xpath("//div[@id='js-rangeslider-0']//div[2]"));
		WebElement ele = driver.findElement(By.id("js-output"));
			
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(slider, Integer.parseInt(offSet), 0).perform();
		Thread.sleep(2000);
		
		System.out.println(ele.getText());

	}
	
	

}
