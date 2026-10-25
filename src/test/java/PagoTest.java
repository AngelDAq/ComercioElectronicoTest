
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PagoTest {

    private Pedido crearPedidoConTotal(double precio) {
        Cliente cliente = new Cliente(1, "Juan Perez", "juan@correo.com");

        Pedido pedido = new Pedido(100, cliente);

        ProductoFisico producto = new ProductoFisico("P001", "Producto", precio, 10, 1);

        pedido.agregarDetalle(new DetallePedido(1, producto));

        return pedido;
    }

    @Test
    void debeCrearPagoPendiente() {
        Pedido pedido = crearPedidoConTotal(80000);
        Pago pago = new Pago(1, pedido, "Tarjeta");

        assertEquals("Pendiente", pago.getEstado());
        assertEquals(80000.0, pago.getMonto(), 0.001);
    }

    @Test
    void debeAprobarPagoValido() {
        Pedido pedido = crearPedidoConTotal(80000);
        Pago pago = new Pago(1, pedido, "Tarjeta");

        assertTrue(pago.procesarPago());
        assertEquals("Aprobado", pago.getEstado());
        assertEquals("Pagado", pedido.getEstado());
    }



    @Test
    void debeRechazarPagoSinPedido() {
        Pago pago = new Pago(3, null, "Tarjeta");

        assertFalse(pago.procesarPago());
        assertEquals("Rechazado", pago.getEstado());
    }

    @Test
    void debeGuardarMetodoDePago() {
        Pedido pedido = crearPedidoConTotal(50000);
        Pago pago = new Pago(4, pedido, "PSE");

        assertEquals("PSE", pago.getMetodoPago());
    }

    @Test
    void debePermitirActualizarMetodoDePago() {
        Pedido pedido = crearPedidoConTotal(50000);
        Pago pago = new Pago(5, pedido, "Tarjeta");

        pago.setMetodoPago("Efectivo");

        assertEquals("Tarjeta", pago.getMetodoPago());
    }

}
