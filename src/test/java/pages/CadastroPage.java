package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

public class CadastroPage extends RunCucumberTest {

    private By localizador_titulo_masculino = By.id("id_gender1");
    private By localizador_titulo_feminino = By.id("id_gender2");
    private By localizador_primeiro_nome = By.id("customer_firstname");
    private By localizador_segundo_nome = By.id("customer_lastname");
    private By localizador_senha = By.id("passwd");
    private By localizador_dia = By.id("days");
    private By localizador_mes = By.id("months");
    private By localizador_ano = By.id("years");
    private By localizador_endereco = By.id("address1");
    private By localizador_cidade = By.id("city");
    private By localizador_estado = By.id("id_state");
    private By localizador_codigo_postal = By.id("postcode");
    private By localizador_telefone = By.id("phone_mobile");
    private By localizador_botao_registar = By.id("submitAccount");
    private By localizador_nome_validar = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span"); // OBS : PRECISA MELHORAR

    public void selecionarTitulo(Integer tipo) {
        Utils.esperarElemento(localizador_titulo_masculino, 20);
        if (tipo == 1) {
            getDriver().findElement(localizador_titulo_masculino).click();
        } else if (tipo == 2) {
            getDriver().findElement(localizador_titulo_feminino).click();
        }
    }

    public void preencherPrimeiroNome(String nome) {
        getDriver().findElement(localizador_primeiro_nome).sendKeys(nome);
    }

    public void preencherUltimoNome(String ultimoNome) {
        getDriver().findElement(localizador_segundo_nome).sendKeys(ultimoNome);
    }

    public void preencherSenha(String senha) {
        getDriver().findElement(localizador_senha).sendKeys(senha);
    }

    public void selecionarDataAniversario(Integer dia, Integer mes, String ano) {

        Select selecionarDia = new Select(getDriver().findElement(localizador_dia));
        selecionarDia.selectByIndex(dia);

        Select selecionarMes = new Select(getDriver().findElement(localizador_mes));
        selecionarMes.selectByIndex(mes);

        Select selecionarAno = new Select(getDriver().findElement(localizador_ano));
        selecionarAno.selectByValue(ano);

    }

    public void preencherEndereco(String endereco) {
        getDriver().findElement(localizador_endereco).sendKeys(endereco);
    }

    public void preencherCidade(String cidade) {
        getDriver().findElement(localizador_cidade).sendKeys(cidade);
    }

    public void selecionarEstado(String estado) {

        Select selecionarEstado = new Select(getDriver().findElement(localizador_estado));
        selecionarEstado.selectByVisibleText(estado);
    }

    public void preencherCodigoPostal(String codigoPostal) {
        getDriver().findElement(localizador_codigo_postal).sendKeys(codigoPostal);
    }

    public void preencherTelefone(String telefone) {
        getDriver().findElement(localizador_telefone).sendKeys(telefone);
    }

    public void clicarRegistrar() {
        getDriver().findElement(localizador_botao_registar).click();
    }

    public void validarCadastro(String nome, String sobrenome) {
        String resultadoAtual = getDriver().findElement(localizador_nome_validar).getText();
        Assert.assertEquals(nome + " " + sobrenome, resultadoAtual);
    }

}
