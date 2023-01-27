package proyecto_division;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivisionTest {
    @Test
    public void testC1(){
        Division instance = new Division();
        Float resultado = instance.calcularDivision(1.0F, 1.0F);
        assertEquals(1.0F,resultado,0);
    }
}