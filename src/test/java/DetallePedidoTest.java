
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DetallePedidoTest {

    @Test
    void debeCalcularSubtotalDeDosUnidades() {
        ProductoFisico mouse = new ProductoFisico("P001", "Mouse", 80000, 10, 0.5);

        DetallePedido detalle = new DetallePedido(2, mouse);

        assertEquals(160000.0, detalle.calcularSubtotal(), 0.001);
    }



}
