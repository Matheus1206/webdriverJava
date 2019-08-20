#webdriver
<h1>Login Truckpad</h1>
<h2> Dependência</h2>
Neste projeto foram utilizados:
<ol>
<li><b> Selenium;</b></li>
<li><b>- JUnit.</b></li>
<ol>

<h2>Resumo</h2>
O objetivo desse projeto é realizar a automação de teste login na aplicação do truckpad.

<h2>Passo a passo</h2>
<b>Explicação do @Before</b>
<ol>
Neste processo de @Before foram feitos os sguintes passos:
<li> Setendo a propriedade de sistema onde encontra-se o webdriver para a abertura do Chrome</li>
<li> Criação da referência "navegador" do tipo WebDriver</li> 
<li> Maximização da janela para melhor visualização do teste</li>
<li> Espera implícita de 5 segundos</li>
<li> Navegador entra no link "https://tms.truckpad.com.br/entrar"</li>
<ol>
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


