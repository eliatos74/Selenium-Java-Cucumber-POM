package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.time.Duration;
import java.util.Random;

public class Utils extends RunCucumberTest {

    public static void esperarElemento(By elemento, int tempo){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(tempo));
        wait.until(ExpectedConditions.elementToBeClickable(elemento));
    }

    public static String gerarEmailAleatorio(){

        String email_init = "teste";
        String email_final = "@qazando.com.br";

        Random random = new Random();
        int minimo = 1;
        int maximo = 99999999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return email_init + resultado + email_final;
    }

    public static String[] gerarNomesAleatorio () {

        String nomes[] = {"Elias","Manoel","Bruna","Leticia","Jardel","Alexandre","Vitor","Carla"};
        String sobreNomes[] = {"Santos","Ferreira","Costa","Batista","Silva","Conceição","Almeida","Girão"};

        String nomeEscolhido = nomes[(int) (Math.random() * nomes.length)];
        String sobreNomeEscolhido = sobreNomes[(int) (Math.random() * sobreNomes.length)];

        String nome[] = {nomeEscolhido,sobreNomeEscolhido};

        return nome;
    }
}