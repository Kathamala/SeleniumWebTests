package erentavtests;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertFalse;

public class CadastroLancamentosTest {

        @Before
        public void setup() throws InterruptedException {
            ERentavTestHelper.setup("https://dev.e-rentav.com/149/operations/operation/create");
        }

        @AfterClass
        public static void quitDriver() {
            ERentavTestHelper.tearDown();
        }

        @Test
        public void cadastroLancamentos() throws InterruptedException{
            WebElement tipo = ERentavTestHelper.getDriver().findElement(By.xpath("//*[@id=\"operation\"]/div[1]/div/div[1]/div/div/div/input"));
            tipo.click();
            Thread.sleep(500);
            WebElement tipoDropDown = ERentavTestHelper.getDriver().findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[1]"));
            tipoDropDown.click();

            WebElement conta = ERentavTestHelper.getDriver().findElement(By.xpath("//*[@id=\"operation\"]/div[1]/div/div[2]/div/div/div/input"));
            conta.click();
            Thread.sleep(500);
            WebElement contaDropDown = ERentavTestHelper.getDriver().findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/ul/li[3]"));
            contaDropDown.click();

            WebElement descricao = ERentavTestHelper.getDriver().findElement(By.xpath("//*[@id=\"description\"]"));
            descricao.sendKeys("Conta Teste Selenium");

            WebElement dtOperacao = ERentavTestHelper.getDriver().findElement(By.xpath("//*[@id=\"date_time_trade\"]"));
            dtOperacao.sendKeys("05/12/2023");

            WebElement dtVencimento = ERentavTestHelper.getDriver().findElement(By.xpath("//*[@id=\"expiration_date\"]"));
            dtVencimento.sendKeys("05/01/2024");

            WebElement simbolo = ERentavTestHelper.getDriver().findElement(By.xpath("//*[@id=\"symbol\"]"));
            simbolo.sendKeys("12345");

            WebElement quantidade = ERentavTestHelper.getDriver().findElement(By.xpath("//*[@id=\"quantity\"]"));
            quantidade.sendKeys("2000");

            WebElement multiplicador = ERentavTestHelper.getDriver().findElement(By.xpath("//*[@id=\"multiplier\"]"));
            multiplicador.sendKeys("100");

            WebElement valorTotal = ERentavTestHelper.getDriver().findElement(By.xpath("//*[@id=\"operation\"]/div[1]/div/div[9]/div/input"));
            valorTotal.sendKeys("20000");

            WebElement vlComissao = ERentavTestHelper.getDriver().findElement(By.xpath("//*[@id=\"operation\"]/div[1]/div/div[10]/div/input"));
            vlComissao.sendKeys("12345");

            WebElement tataAdmin = ERentavTestHelper.getDriver().findElement(By.xpath("//*[@id=\"operation\"]/div[1]/div/div[11]/div/input"));
            tataAdmin.sendKeys("54321");

            WebElement strike = ERentavTestHelper.getDriver().findElement(By.xpath("//*[@id=\"strike_price\"]"));
            strike.sendKeys("40000");

            WebElement posicao = ERentavTestHelper.getDriver().findElement(By.xpath("//*[@id=\"operation\"]/div[1]/div/div[13]/div/div/div[1]/input"));
            posicao.click();
            Thread.sleep(500);
            WebElement posicaoDropDown = ERentavTestHelper.getDriver().findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/ul/li[2]"));
            posicaoDropDown.click();

            WebElement callPut = ERentavTestHelper.getDriver().findElement(By.xpath("//*[@id=\"operation\"]/div[1]/div/div[14]/div/div/div[1]/input"));
            callPut.click();
            Thread.sleep(500);
            WebElement callPutDropDown = ERentavTestHelper.getDriver().findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[2]"));
            callPutDropDown.click();

            WebElement numOrdem = ERentavTestHelper.getDriver().findElement(By.xpath("//*[@id=\"order\"]"));
            numOrdem.sendKeys("20000");

            WebElement save = ERentavTestHelper.getDriver().findElement(By.xpath("//*[@id=\"operation\"]/div[2]/div/div/button/span"));
            save.submit();

            Thread.sleep(2000);

            WebElement log = ERentavTestHelper.getDriver().findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/span/div"));

            assertFalse(ERentavTestHelper.hasClass(log, "alert-danger"));
        }
}
