package motoresdebusqueda.dogpile;

import motoresdebusqueda.dogpile.steps.UsuarioDogPile;
import motoresdebusqueda.dogpile.utils.KillBrowser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import net.thucydides.core.webdriver.WebdriverManager;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.List;

import static java.lang.Thread.sleep;

@RunWith(SerenityRunner.class)

public class CuandoBuscoResultadosConTextoEnDogpile {
    @Steps
    UsuarioDogPile juan;
    @Managed
    WebDriver driver;
    @Test
    public void resultado_de_wikipedia_contiene_texto_correcto() throws InterruptedException {
        juan.ingresa_a_dogpile();

        juan.busca_por_palabra_clave("rock  nacional");

        juan.deberia_ver_resultado_de_titulo_con_texto_correcto("Argentine rock - Wikipedia",
                "Argentine Rock Nacional is one of the principal predecessors");
        //sleep(20000);
    }

    @After
    public void despuesDeEjecutarElTest(){

       // driver.quit();
        //cerrartodoslo;
        
    }
}
