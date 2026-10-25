
import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Agregar productos al inventario
    public void agregarProducto(Producto... productos) {
        for (Producto p : productos) {
            if (p != null) {
                this.productos.add(p);
            }
        }
    }

    // Buscar un producto por su código
    public Producto buscarProductoPorCodigo(String codigo) {
        if (codigo == null) {
            return null;
        }

        for (Producto p : this.productos) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }

        return null;
    }

    // Verificar si hay stock disponible
    public boolean hayStock(String codigo, int cantidadRequerida) {

        if (cantidadRequerida <= 0) {
            return false;
        }

        Producto p = buscarProductoPorCodigo(codigo);

        return p != null && p.getStock() >= cantidadRequerida;
    }
}



