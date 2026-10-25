
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {


    @Test
    void ambosSubtiposDebenCalcularCostoEnvio() {
        ProductoFisico fisico = new ProductoFisico("P001", "Mouse", 80000, 10, 0.5);
        ProductoDigital digital = new ProductoDigital("P002", "Curso", 60000, 20, "www.cursos.com");

        assertTrue(fisico.calcularCostoEnvio() >= 0);
        assertEquals(0.0, digital.calcularCostoEnvio());
    }


    @Test
    void actualizarStockDebeRestarLaCantidad() {
        Producto producto = new ProductoFisico("P001", "Mouse", 80000, 10, 0.5);

        producto.actualizarStock(4);

        assertEquals(6, producto.getStock());
    }




}

