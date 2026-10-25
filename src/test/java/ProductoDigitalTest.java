
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoDigitalTest {

    @Test
    void elEnvioDebeSerCero() {
        ProductoDigital curso = new ProductoDigital("P003", "Curso Java", 60000, 100, "www.cursos.com/java");

        assertEquals(0.0, curso.calcularCostoEnvio());
    }

    @Test

    void debeGuardarElEnlace() {
        ProductoDigital curso = new ProductoDigital("P003", "Curso Java", 60000, 100, "www.cursos.com/java");

        assertEquals("www.cursos.com/java", curso.getEnlaceDescarga());
    }




}
