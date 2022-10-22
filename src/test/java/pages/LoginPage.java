package pages;

import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;

public class LoginPage extends RunCucumberTest {

    private By localizador_email = By.id("email_create");
    private By localizador_botao = By.id("SubmitCreate");

    public void acessarTelaLogin(){
        getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        Utils.esperarElemento(localizador_email,20);
    }

    public void preencherCampoEmail(){
        getDriver().findElement(localizador_email).sendKeys(Utils.gerarEmailAleatorio());
    }

    public void clicarCriarConta(){
        getDriver().findElement(localizador_botao).click();
    }
}
