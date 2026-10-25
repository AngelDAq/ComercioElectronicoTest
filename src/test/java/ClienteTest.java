
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    void debeCrearClienteConSusDatos() {
        Cliente cliente = new Cliente(
                1, "Juan Perez", "juan@correo.com");

        assertEquals(1, cliente.getIdCliente());
        assertEquals("Juan Perez", cliente.getNombre());
        assertEquals("juan@correo.com", cliente.getCorreo());
    }


    @Test
    void debeAgregarPedidoAlHistorial() {
        Cliente cliente = new Cliente(1, "Juan Perez", "juan@correo.com");

        Pedido pedido = new Pedido(100, cliente);

        assertTrue(cliente.getListaPedidos().contains(pedido));
    }


}
