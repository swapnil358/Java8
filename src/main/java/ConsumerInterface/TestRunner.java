package ConsumerInterface;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.util.concurrent.Uninterruptibles;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRunner {

	static WebDriver driver;

	
	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demoqa.com/select-menu");

	
		WebElement element1 = driver.findElement(By.id("oldSelectMenu"));
		selectDropdownbyJava8(e->e.selectByVisibleText("Magenta"), element1);
		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		selectDropdownbyJava8(e->e.selectByValue("3"), element1);
		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		selectDropdownbyJava8(e->e.selectByIndex(5), element1);
		
		List<WebElement> elements = new Select(driver.findElement(By.id("cars"))).getOptions();
		elements.forEach(e->e.click());
		elements.stream().skip(2).forEach(e->e.click());
		
	}
	
	
	

	public static void selectDropdownbyJava8(Consumer<Select> consumer, WebElement element) {
		Select select =  new Select(element);
		consumer.accept(select);
		
		
		
		
	}
	
	

}
