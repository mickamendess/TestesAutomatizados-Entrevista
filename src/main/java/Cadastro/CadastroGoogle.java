package Cadastro;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CadastroGoogle {
	ChromeDriver driver;
	@BeforeTest
	public void setup() throws Exception {
		System.out.println("Esse teste tem como objetivo validar o Cadastro do Google.");
        driver =  new ChromeDriver(); 
	}
	
	@Test
	public void Login() throws Throwable{
		driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		System.out.println("Acessando página...");
		driver.findElement(By.id("firstName")).sendKeys("Teste");
		System.out.println("Cadastrando nome");
		driver.findElement(By.id("lastName")).sendKeys("Automatizado");
		System.out.println("Cadastrando Sobrenome");
		driver.findElement(By.id("username")).sendKeys("testautomatizadoentrevistaNEO123");
		System.out.println("Cadastrando Email");
		driver.findElement(By.name("Passwd")).sendKeys("Teste123!");
		System.out.println("Cadastrando Senha");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("Teste123!");
		driver.findElement(By.id("accountDetailsNext")).click();
		System.out.println("Confirmando...");
		Thread.sleep(2000);
		//Insira celular
		driver.findElement(By.id("phoneNumberId")).sendKeys("67991793285");
		System.out.println("Inserindo Celular!");
		//Botão Próximo
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]")).click();
		System.out.println("Cheque seu celular!");
	}
	
}
