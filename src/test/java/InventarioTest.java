
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InventarioTest {

    private Inventario crearInventario() {

        Inventario inventario = new Inventario();

        ProductoFisico mouse = new ProductoFisico("P001", "Mouse Gamer", 80000, 10, 0.5);
        ProductoFisico teclado = new ProductoFisico("P002", "Teclado", 150000, 5, 1.2);
        ProductoDigital curso = new ProductoDigital("P003", "Curso Java", 60000, 100, "www.cursos.com");

        inventario.agregarProducto(mouse, teclado, curso);
        return inventario;
    }


    @Test
    void debeEncontrarProductoExistente() {
        Inventario inventario = crearInventario();
        assertNotNull(inventario.buscarProductoPorCodigo("P001"));
    }

    @Test
    void debeEncontrarCodigoSinDistinguirMayusculas() {
        Inventario inventario = crearInventario();
        assertNotNull(inventario.buscarProductoPorCodigo("p001"));
    }


    @Test
    void debeAceptarCantidadMenorAlStock() {
        Inventario inventario = crearInventario();
        assertTrue(inventario.hayStock("P001", 8));
    }


}
