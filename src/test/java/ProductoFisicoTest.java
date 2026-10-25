
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoFisicoTest {


    @Test
    void debeCalcularEnvioDeUnKilo() {
        ProductoFisico producto = new ProductoFisico("P002", "Producto", 10000, 5, 1.0);

        assertEquals(5000.0, producto.calcularCostoEnvio(), 0.001);
    }


}
