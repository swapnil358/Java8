package SeleniumPractice;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollAction {

	 static String parentWindHandler;
	static WebDriver driver;

	@BeforeMethod
	public void setup() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.fb.com");

		Thread.sleep(2000);
		driver.get("https://everythingautomation.blogspot.com/"); // https://the-internet.herokuapp.com/horizontal_slider

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void teaDown() throws InterruptedException {
		//driver.quit();
	}

	@Test
	public void openNewTab() throws Exception {
		parentWindHandler = driver.getWindowHandle();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);

		Thread.sleep(1000);
		System.out.println("Open a new tab.");
		Set<String> browsers = driver.getWindowHandles();
		for (String i : browsers) {
			if (!i.equals(parentWindHandler)) {
				driver.switchTo().window(i);
				driver.get("https://www.fb.com");
				Thread.sleep(5000);
				System.out.println(driver.getTitle());
				driver.close();
				
				
				Thread.sleep(1000);
				driver.switchTo().window(parentWindHandler);
				System.out.println(driver.getTitle());
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_W);
				
			}
			 
		}
	}
}
