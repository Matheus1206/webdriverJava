package Tests;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class testLoginTruckPad {
    private WebDriver navegador;

    @Before
    public void setup() {
        // Abrindo o Chrome
            System.setProperty("webdriver.chrome.driver","C:\\Users\\matheus.oliveira\\Desktop\\Drivers\\chromedriver.exe");
            navegador = new ChromeDriver();
            navegador.manage().window().maximize();
            navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Navegando até o site
            navegador.get("https://tms.truckpad.com.br/entrar");
}
    @Test
    public void testLoginInválido(){
        // Inserindo o email
        navegador.findElement(By.id("user_email")).sendKeys("desenvolvedor@truckpad.com.br");

        // Inserindo a senha errada
        navegador.findElement(By.id("user_password")).sendKeys("truckpad@caseQA2019");

        // Clicar no botão "Entrar"
        navegador.findElement(By.name("commit")).click();
    }

    @After
    public void validation(){
        // Validação
        String validador = navegador.findElement(By.xpath("//*[@class='top-messages']")).getText();
        assertEquals("E-mail ou senha inválidos.",validador);
    }
}
