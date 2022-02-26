
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;    
    
public class Circulo_DTGTest {

    @Before
    public void setup(){

    }
        
    @Test
    public void testarea() {
        Circulo_DTG pruebacirculo = new Circulo_DTG( -3, "circulo");
        double resultado_prueba = pruebacirculo.area();
        

        assertEquals(15, resultado_prueba);
    }


}
    