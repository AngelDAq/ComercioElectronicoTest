
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    private Pedido crearPedido() {
        Cliente cliente = new Cliente(1, "Juan Perez", "juan@correo.com");

        return new Pedido(100, cliente);
    }



    @Test
    void debeCalcularTotalSinDescuento() {
        Pedido pedido = crearPedido();

        ProductoFisico mouse = new ProductoFisico("P001", "Mouse", 80000, 10, 0.5);

        pedido.agregarDetalle(new DetallePedido(2, mouse));

        assertEquals(160000.0, pedido.getTotal(), 0.001);
    }




    @Test
    void debeActualizarTotalAlAgregarDetalles() {
        Pedido pedido = crearPedido();
        ProductoFisico mouse = new ProductoFisico("P001", "Mouse", 80000, 10, 0.5);

        pedido.agregarDetalle(new DetallePedido(1, mouse));
        pedido.agregarDetalle(new DetallePedido(1, mouse));

        assertEquals(160000.0, pedido.getTotal(), 0.001);
        assertEquals(2, pedido.getDetalles().size());
    }



    @Test
    void debeAsociarElPedidoConElCliente() {
        Cliente cliente = new Cliente(1, "Juan Perez", "juan@correo.com");

        Pedido pedido = new Pedido(100, cliente);

        assertSame(cliente, pedido.getCliente());
        assertTrue(cliente.getListaPedidos().contains(pedido));
    }
}
