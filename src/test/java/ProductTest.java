import org.example.Product;
import org.example.Discount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    @DisplayName("Un producto tiene un nombre y un precio")
    void testUnProductoTieneUnNombreYunPrecio(){
        Product producto = new Product();
        assertEquals("manzana", producto.getName());
        assertEquals(20, producto.getPrice());
    }

    @Test
    @DisplayName("El precio de un producto sin descuento es el precio original del producto")
    void testElPrecioDeUnProductoSinDescuentoEsElPrecioOriginalDelProducto(){
        Product product = new Product();
        assertEquals(20, product.getPriceWithoutDiscount());
    }

    @Test
    @DisplayName("El precio de un producto con descuento es el precio original con el descuento del % asignado!")
    void testElPrecioDeUnProductoConDescuentoEsElPrecioOriginalConElDescuentoAsignado(){
        Product product = new Product();
        assertEquals(2.0, product.getPriceWithDiscount());
    }
}
