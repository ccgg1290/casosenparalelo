package motoresdebusqueda.dogpile;

import motoresdebusqueda.dogpile.steps.UsuarioDogPile;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.joda.time.Seconds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.*;

@RunWith(SerenityRunner.class)
public class CuandoEjecutamosUnaBusquedaEnGoogle {
    @Steps
    UsuarioDogPile juan;
    @Managed
    WebDriver driver;
    @Test
    public void deberiamos_ver_resultados_relevantes_en_google() throws InterruptedException {
        juan.ingresa_a_google();

        juan.busca_por_palabra_clave("rock nacional");

        juan.deberia_ver_resutlados_con_palabra("rock");

        sleep(20000);
    }

}
