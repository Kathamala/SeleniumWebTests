package erentavtests;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CadastroPortfolioTest {	
	@Before
	public void setup() throws InterruptedException {
		ERentavTestHelper.setup("https://dev.e-rentav.com/149/operations/portfolio/create");
	}
	
    @AfterClass
    public static void quitDriver() {
    	//ERentavTestHelper.tearDown();
    }
	
	@Test
	public void cadastroPortfolio() throws InterruptedException{
		//ERentavTestHelper.driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/form/div[1]/div/div[1]/div/div/div/input"));
		WebElement description = ERentavTestHelper.driver.findElement(By.id("description"));
		description.sendKeys("Conta Teste Selenium");
	}
}














