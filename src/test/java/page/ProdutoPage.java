package page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ProdutoPage extends BasePage {

	final String PRECO_NOTEBOOK = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[1]/div";
	final String PRECO_NOTEBOOK_CSS = "#root > div > div.src__Container-lknyo-3.fDrjdG > div.src__ProductOffer-lknyo-6.euodGz > div.src__Wrapper-sc-1p2s4st-1.fJxEvh > div.src__PriceWrapper-lo2vta-4.hULVIN > div";
	public ProdutoPage(WebDriver driver) {
		super(driver);
	}

	public String retornaValorProduto() throws Exception {
		logger.info("Retorna Valor do Produto");
		takeScreenShot("Retorna Valor do Produto");
		String valorProduto;
		try {
			valorProduto = driver.findElement(By.xpath(PRECO_NOTEBOOK)).getText();
		} catch (NoSuchElementException  e) {
			valorProduto = driver.findElement(By.cssSelector(PRECO_NOTEBOOK_CSS)).getText();
		}
		return valorProduto;
	}

	public void preencheClicaCep() {
		driver.findElement(By.xpath("//input[@id='freight-field']")).sendKeys("05346-000");
		driver.findElement(By.xpath("//span[contains(text(),'Ok')]")).click();

	}

	public void confirmaVoltagemProduto() {
		driver.findElement(By.xpath("//span[contains(text(),'Sim, continuar')]"));

	}

	private void clicarComprarProduto() {
		driver.findElement(By.xpath("//span[contains(text(),'comprar')]"));
	}

}
