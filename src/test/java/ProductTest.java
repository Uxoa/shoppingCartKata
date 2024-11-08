import org.example.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    @DisplayName("Un producto tiene un nombre y un precio")
    void testUnProductoTieneUnNombreYunPrecio(){
        Product producto = new Product();
        assertEquals("manzana", producto.getName());
        assertEquals(2.3, producto.getPrice());
    }
}
