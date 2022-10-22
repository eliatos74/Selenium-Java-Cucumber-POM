package steps;

import cucumber.api.java.pt.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CadastroPage;
import runner.RunCucumberTest;
import support.Utils;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage();
    Utils utils = new Utils();

    private String nome;
    private String sobrenome;

    @Quando("^eu preencho o formulário de cadastro$")
    public void eu_preencho_o_formulário_de_cadastro() throws Throwable {
        cadastroPage.selecionarTitulo(1);
        cadastroPage.preencherPrimeiroNome(nome = utils.gerarNomesAleatorio()[0]);
        cadastroPage.preencherUltimoNome(sobrenome = utils.gerarNomesAleatorio()[1]);
        cadastroPage.preencherSenha("minhasenha@#1123");
        cadastroPage.selecionarDataAniversario(20,12,"2000");
        cadastroPage.preencherEndereco("Minha rua");
        cadastroPage.preencherCidade("Morada Nova");
        cadastroPage.selecionarEstado("Alabama");
        cadastroPage.preencherCodigoPostal("10000");
        cadastroPage.preencherTelefone("999999999");
    }

    @E("^clico em registrar$")
    public void clico_em_registrar() throws Throwable {
        cadastroPage.clicarRegistrar();
    }

    @Então("^vejo a mensagem cadastro realizado com sucesso$")
    public void vejo_a_mensagens_cadastro_realizado_com_sucesso() throws Throwable {
        cadastroPage.validarCadastro(nome,sobrenome);
    }

}
