package erentavtests;

import static org.junit.Assert.assertFalse;

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
    	ERentavTestHelper.tearDown();
    }
	
	@Test
	public void cadastroPortfolio() throws InterruptedException{
		WebElement tipo1 = ERentavTestHelper.getDriver().findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/form/div[1]/div/div[1]/div/div/div/input"));
		tipo1.click();
		Thread.sleep(500);
		WebElement tipo2 = ERentavTestHelper.getDriver().findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[1]"));
		tipo2.click();
		
		WebElement conta1 = ERentavTestHelper.getDriver().findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/form/div[1]/div/div[2]/div/div/div/input"));
		conta1.click();
		Thread.sleep(500);
		WebElement conta2 = ERentavTestHelper.getDriver().findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[3]"));
		conta2.click();
		
		WebElement descricao = ERentavTestHelper.getDriver().findElement(By.id("description"));
		descricao.sendKeys("Conta Teste Selenium");
		
		WebElement dtAbertura = ERentavTestHelper.getDriver().findElement(By.id("date_time_trade"));
		dtAbertura.sendKeys("05/12/2023");
		
		WebElement dtVencimento = ERentavTestHelper.getDriver().findElement(By.id("expiration_date"));
		dtVencimento.sendKeys("05/01/2024");
		
		WebElement simbolo = ERentavTestHelper.getDriver().findElement(By.id("symbol"));
		simbolo.sendKeys("AAAAA");
		
		WebElement qtAbertura = ERentavTestHelper.getDriver().findElement(By.id("quantity"));
		qtAbertura.sendKeys("99999999999999999999999999999");
		
		WebElement valorTotal = ERentavTestHelper.getDriver().findElement(By.name("value"));
		valorTotal.sendKeys("2000000");
		
		WebElement viComissao = ERentavTestHelper.getDriver().findElement(By.name("commissions"));
		viComissao.sendKeys("1000000");
		
		WebElement taxaAdmin = ERentavTestHelper.getDriver().findElement(By.name("fees"));
		taxaAdmin.sendKeys("2599");
		
		WebElement strike = ERentavTestHelper.getDriver().findElement(By.id("strike_price"));
		strike.sendKeys("9999999");
		
		WebElement posicao1 = ERentavTestHelper.getDriver().findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/form/div[1]/div/div[12]/div/div/div/input"));
		posicao1.click();
		Thread.sleep(500);
		WebElement posicao2 = ERentavTestHelper.getDriver().findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/ul/li[2]"));
		posicao2.click();

		WebElement callput1 = ERentavTestHelper.getDriver().findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/form/div[1]/div/div[13]/div/div/div/input"));
		callput1.click();
		Thread.sleep(500);
		WebElement callput2 = ERentavTestHelper.getDriver().findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[2]"));
		callput2.click();
		
		WebElement nOrdem = ERentavTestHelper.getDriver().findElement(By.id("order"));
		nOrdem.sendKeys("2235262362362");
		
		WebElement button = ERentavTestHelper.getDriver().findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/form/div[2]/div/div/button"));
		button.submit();
		
		Thread.sleep(2000);
		
		WebElement error = ERentavTestHelper.getDriver().findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/span/div"));
		
		assertFalse(ERentavTestHelper.hasClass(error, "alert-danger"));
	}
}