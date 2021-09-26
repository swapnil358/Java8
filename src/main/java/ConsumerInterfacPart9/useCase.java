package ConsumerInterfacPart9;

import java.util.List;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class useCase {
	
	//https://youtu.be/OXJDdSTYP2Y?list=PL9ok7C7Yn9A_o6wKmhObLceifmpoQ9QNp
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		List<WebElement> elements = driver.findElements(By.xpath("//a"));
	
		
		Consumer<WebElement> consumer = (e)->System.out.println(e.getText());
		Consumer<WebElement> consumer1 = (e)->{
			if(!e.getText().isBlank()) {
				System.out.println(e.getText());
			}
		};
		//elements.forEach(consumer);
		elements.forEach(consumer1);
		
		
	}

}
