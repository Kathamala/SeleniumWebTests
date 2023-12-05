package erentavtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ERentavTestHelper {
	public static String driverPath = "chromedriver.exe";
	public static WebDriver driver;
	
	public static void setup(String link) throws InterruptedException{
		System.out.println("Iniciando suíte de testes.");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		link = link == "" ? "https://dev.e-rentav.com/149" : link;
		driver.get(link);
		
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));
		email.sendKeys("thiagovao2000@hotmail.com");
		password.sendKeys("1#gvVwpew");
		email.submit();
		Thread.sleep(2000);
	}
	
	public static void tearDown(){
		driver.quit();
	}
}
