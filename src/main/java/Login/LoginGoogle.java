package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginGoogle {
	ChromeDriver driver;
	@BeforeTest
	public void setup() throws Exception {
		System.out.println("Esse teste tem como objetivo validar o login do Google.");
        driver =  new ChromeDriver(); 
	}
	
	@Test
	public void Login() throws Throwable{
		driver.navigate().to("https://accounts.google.com/");
		System.out.println("Acessando Página!");
		driver.findElement(By.name("identifier")).sendKeys("mickamendess@gmail.com");
		System.out.println("Inserindo e-mail");
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.name("password")).sendKeys("*");
		System.out.println("Atualmente o Google está bloqueando acessos por Softwares de Testes Automatizados!");
		driver.findElement(By.id("passwordNext")).click();
		if(driver.findElement(By.className("tbyFuf")).isDisplayed()) {
			System.out.println("Sucesso!");
			driver.quit();
		}
		else {
			System.out.println("Falha!");
			driver.quit();
		}
	}
	
}
