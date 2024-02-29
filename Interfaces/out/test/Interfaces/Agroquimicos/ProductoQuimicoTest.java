package Agroquimicos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoQuimicoTest extends TestCase{
    @Test
    void testTieneEstadoPatologico() {
        ProductoQuimico productoQuimico = new ProductoQuimico("Herbicida X");
        productoQuimico.addEstado("Hojas Amarillas");

        assertTrue(productoQuimico.tieneEstadoPatologico("Hojas Amarillas"));
    }
    @Test
   void testCultivosPermitido() {
        ProductoQuimico productoQuimico = new ProductoQuimico("Herbicida X");
        productoQuimico.addCultivosDesaconsejados(new Cultivo("Girasol"));

        assertFalse(productoQuimico.cultivosPermitido(new Cultivo("Girasol")));
    }

}