package chormetests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaTest {

	private String driverPath = "chromedriver.exe";
	private WebDriver driver;
	
	@Before
	public void setup() {
		System.out.println("Iniciando o browser Chrome");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get("https://pt.wikipedia.org");
	}
	
	@Test
	public void testFire(){
		WebElement element = driver.findElement(By.name("search"));
		element.sendKeys("Final Fantasy VII");
		element.submit();
		System.out.println("Page title is: " + driver.getTitle());
		
		driver.quit();
	}
	
	@Test
	public void testGooglePageTitleInIEBrowser() {
		String strPageTitle = driver.getTitle();
		System.out.println("Page title: - " + strPageTitle);
		assertEquals(strPageTitle, "Wikipédia, a enciclopédia livre");
		
		driver.quit();
	}
	
}
