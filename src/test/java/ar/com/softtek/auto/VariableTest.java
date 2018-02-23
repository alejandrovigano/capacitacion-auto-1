package ar.com.softtek.auto;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class VariableTest {

    @Test
    public void asignacionTest(){
        int x = 1;
        assertEquals(x,1);
    }

    @Test
    public void asignacionErrorTest(){
        int x = 1;
        assertEquals(x,1);
    }

    @Test
    public void condicionalTest(){
        int x = 2;
        boolean esMayor = false;
        if(x > 1){
            esMayor = true;
        }
        assertTrue(esMayor);
    }
}
