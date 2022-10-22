package steps;

import cucumber.api.java.pt.*;
import pages.LoginPage;
import runner.RunBase;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage();
    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() throws Throwable {
        getDriver(RunBase.Browser.CHROME);
        loginPage.acessarTelaLogin();
    }

    @E("^acesso o cadastro de usuário$")
    public void acesso_o_cadastro_de_usuário() throws Throwable {
        loginPage.preencherCampoEmail();
        loginPage.clicarCriarConta();
    }
}
