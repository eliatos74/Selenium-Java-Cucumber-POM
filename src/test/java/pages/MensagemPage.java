package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;

public class MensagemPage extends RunCucumberTest {

    private By localizador_selecionar_assunto = By.id("id_contact");
    private By localizador_email = By.id("email");
    private By localizador_mensagem = By.id("message");
    private By localizador_selecinar_arquivo = By.id("fileUpload");
    private By localizador_botao = By.id("submitMessage");
    private By localizador_verificar_mesagem = By.className("alert-success");

    public void acessarTelaMensagem() {
        getDriver().get("http://automationpractice.com/index.php?controller=contact");
    }

    public void selecionarAssunto(String assunto) {
        Select selecionarAssunto = new Select(getDriver().findElement(localizador_selecionar_assunto));
        selecionarAssunto.selectByVisibleText(assunto);
    }

    public void preencherEmail(String email) {
        getDriver().findElement(localizador_email).sendKeys(email);
    }

    public void preencherMensagem(String mensagem) {
        getDriver().findElement(localizador_mensagem).sendKeys(mensagem);
    }

    public void mandarArquivo(String caminhoArquivo) {
        getDriver().findElement(localizador_selecinar_arquivo).sendKeys(caminhoArquivo);
    }

    public void clicarBotao () {
        getDriver().findElement(localizador_botao).click();
    }

    public void verificarMensagem () {
        String resultadoAtual = getDriver().findElement(localizador_verificar_mesagem).getText();
        Assert.assertEquals("Your message has been successfully sent to our team.",resultadoAtual);
    }
}
