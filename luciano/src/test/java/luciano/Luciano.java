package luciano;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Luciano {
	
	//criar a variavel para abrir chromedriver
	  private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		//Abri o navegador
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		//Fechar o navegador
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		//Abrir o site para os testes
		driver.get("http://framedlife.com.br/fotoescambo/users/login");
		
		// Buscar login e senha por id
		WebElement login = driver.findElement(By.id("UserEmail"));
		login.sendKeys("guifreitag@gmail.com");
		WebElement password = driver.findElement(By.id("UserPassword"));
		password.sendKeys("passw0rd");

		//Buscar elemento do botão com xpath
		WebElement button = driver.findElement(By.xpath("//*[@id=\"UserLoginForm\"]/div[4]/input"));
		button.click();
		Thread.sleep(6000);
		
		
	}

}
