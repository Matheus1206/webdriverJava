#webdriver
<h1>Login Truckpad</h1>
<h2> Dependência</h2>
Neste projeto foram utilizados:
<ol>
<li><b> Selenium;</b></li>
<li><b> JUnit.</b></li>
<ol>
 
<h2>Ambiente</h2>
<ol>
<b>IDE:</b> Intellij
<b>Java:</b> "1.8.0_221"
<b>Webdriver:</b> chromedriver  

<h2>Resumo</h2>
O objetivo desse projeto é realizar a automação de teste login na aplicação do truckpad.

<h2>Passo a passo</h2>
<h3>Explicação do @Before</h3>
<ol>
Neste processo de @Before foram feitos os seguintes passos:
<li><b> Setendo a propriedade de sistema onde encontra-se o webdriver para a abertura do Chrome</b></li>
 private WebDriver navegador;
    <br>@Before<br>
    <br>public void setup() {</br>
        <br>// Abrindo o Chrome</br>
            <br>System.setProperty("webdriver.chrome.driver","C:\\Users\\matheus.oliveira\\Desktop\\Drivers\\chromedriver.exe");</br>
<li><b> Criação da referência "navegador" do tipo WebDriver</b></li> 
    navegador = new ChromeDriver();
<li><b> Maximização da janela para melhor visualização do teste</b></li>
     navegador.manage().window().maximize();
<li><b> Espera implícita de 5 segundos</b></li>
     navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
<li><b> Navegador entra no link "https://tms.truckpad.com.br/entrar"</b></li>
            
        // Navegando até o site
            navegador.get("https://tms.truckpad.com.br/entrar");

}
<ol>
 
            
           


<h3>Explicação do @Test</h3>
Este processo refere-se a ação do programa, onde foram os seguintes passos:
<li> <b>Foi digitado o email: "desenvolvedor@truckpad.com.br"</b></li> 
 @Test
    public void testLoginInválido(){
        // Inserindo o email
        navegador.findElement(By.id("user_email")).sendKeys("desenvolvedor@truckpad.com.br");

<li><b> Foi digitada a senha: "truckpad@caseQA2019"</b></li>
// Inserindo a senha errada
        navegador.findElement(By.id("user_password")).sendKeys("truckpad@caseQA2019");
<li><b> Clique no botão "Entrar"</b></li>
        // Clicar no botão "Entrar"
        navegador.findElement(By.name("commit")).click();
    }

<h3>Explicação do @After</h3>
No @Before foram feitas as validações do teste.
<ol>
<li><b> Validação do teste em encontrar a frase "E-mail ou senha inválidos."</b></li>
   @After
    public void validation(){
        // Validação
        String validador = navegador.findElement(By.xpath("//*[@class='top-messages']")).getText();
        assertEquals("E-mail ou senha inválidos.",validador);
    }



