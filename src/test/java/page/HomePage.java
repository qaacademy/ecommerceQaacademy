package page;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	final String BUSCA = "#h_search-input";
	final String BTN_BUSCAR = "//button[@id='h_search-btn']";

public HomePage(WebDriver driver) {
		this.driver = driver;
	}

public void abrirUrl(String url) {
	driver.get(url);

}

public void realizarBuscaProdutoEClica(String produto) {
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(
			ExpectedConditions.presenceOfElementLocated(By.xpath(BTN_BUSCAR)));
	driver.findElement(By.cssSelector(BUSCA)).sendKeys(produto);
	driver.findElement(By.xpath(BTN_BUSCAR)).click();

}

		
}
