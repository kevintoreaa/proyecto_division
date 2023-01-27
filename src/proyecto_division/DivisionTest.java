package proyecto_division;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivisionTest {

    @Test
    public void testC1() throws Exception{
        Division instance = new Division();
        float resultado = instance.calcularDivision(1.0F, 1.0F);
        assertEquals(1.0F,resultado,0);
    }

    @Test
    public void testC2() throws Exception{
        Division instance = new Division();
        float resultado = instance.calcularDivision(1.0F, 0F);
        assertEquals(1.0F,resultado,0);
    }

    @Test
    public void testC3() throws Exception{
        Division instance = new Division();
        float resultado = instance.calcularDivision(2.0F, 2.0F);
        assertEquals(1.0F,resultado,0);
    }

    @Test
    public void testC4() throws Exception{
        Division instance = new Division();
        float resultado = instance.calcularDivision(2.0F, 0F);
        assertEquals(1.0F,resultado,0);
    }

    @Test
    public void testC5() throws Exception{
        Division instance = new Division();
        float resultado = instance.calcularDivision(0F, 0.2F);
        assertEquals(1.0F,resultado,0);
    }
   
    @Test
    public void testC6() throws Exception{
        Division instance = new Division();
        float resultado = instance.calcularDivision(Float.MIN_VALUE, Float.MIN_VALUE);
        assertEquals(1.0F,resultado,0);
    }

    @Test
    public void testC7() throws Exception{
        Division instance = new Division();
        float resultado = instance.calcularDivision(Float.MAX_VALUE, Float.MAX_VALUE);
        assertEquals(1.0F,resultado,0);
    }

    @Test
    public void testC8() throws Exception{
        Division instance = new Division();
        float resultado = instance.calcularDivision(2.40130e-45F, 3.40282e+38F);
        assertEquals(1.0F,resultado,0);
    }

    @Test
    public void testC9() throws Exception{
        Division instance = new Division();
        float resultado = instance.calcularDivision(Float.MAX_VALUE, Float.MIN_VALUE);
        assertEquals(1.0F,resultado,0);
    }
}