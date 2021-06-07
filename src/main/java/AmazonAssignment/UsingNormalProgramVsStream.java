package AmazonAssignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*Open Amazon.in
Fetch all the links in the amazon.in home page.
Fetch the text from the links and remove the empty links
Remove the duplicates.
Sort the text in the alphabetical order.
Print only the text starting with character “C” and “D”

*/

public class UsingNormalProgramVsStream {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	}

	@Test(enabled = false)
	public void usingNormalApproach() {
		List<WebElement> list = driver.findElements(By.xpath("//a"));
		System.out.println(list.size());

		List<String> ls = new ArrayList<String>();

		for (int i = 0; i < list.size(); i++) {

			String text = list.get(i).getText();
			if (!text.isBlank()) {
				ls.add(text);
			}
		}

		ArrayList<String> listAfterRemovingDuplicates = new ArrayList<>(new HashSet<String>(ls));
		Collections.sort(listAfterRemovingDuplicates);
		for (int i = 0; i < listAfterRemovingDuplicates.size(); i++) {
			if (listAfterRemovingDuplicates.get(i).startsWith("C")
					|| listAfterRemovingDuplicates.get(i).startsWith("D"))
				System.out.println(listAfterRemovingDuplicates.get(i));
		}
	}
	 
	
	@Test
	public void usingStream() {
		driver.findElements(By.xpath("//a"))
		.stream()
		.map(e->e.getText())
		.filter(s->!s.isBlank())
		.distinct()
		.sorted()
		.filter(s->s.startsWith("C")||s.startsWith("D"))
		.forEach(System.out::println);
		//.forEach(s->System.out.println(s));
	
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}
}
