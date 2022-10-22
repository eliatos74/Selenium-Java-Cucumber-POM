package steps;

import cucumber.api.java.pt.*;
import pages.MensagemPage;
import runner.RunCucumberTest;

public class MensagemSteps extends RunCucumberTest {

    MensagemPage mensagemPage = new MensagemPage();
    @Dado("^que estou na tela de mensagem$")
    public void que_estou_na_tela_de_mensagem(){
        mensagemPage.acessarTelaMensagem();
    }

    @E("^preencho todos os campos$")
    public void preencho_todos_os_campos(){
        mensagemPage.selecionarAssunto("Webmaster");
        mensagemPage.preencherEmail("teste@email.com");
        mensagemPage.preencherMensagem("Minha Mensagem");
        mensagemPage.mandarArquivo("C:\\Users\\Elias\\Documents\\Curso Selenium com IntelJ\\QazandoPraticando\\imagemTelaInicialSite.png");
    }

    @Quando("^clico em enviar mensagem$")
    public void clico_em_enviar_mensagem(){
        mensagemPage.clicarBotao();
    }

    @Então("^vejo a mensagem enviada com sucesso$")
    public void vejo_a_mensagem_enviada_com_sucesso(){
        mensagemPage.verificarMensagem();
    }
}
