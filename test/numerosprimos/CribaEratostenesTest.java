/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package numerosprimos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Antonio
 */
public class CribaEratostenesTest {
    
    public CribaEratostenesTest() {
    }
    
   

    /**
     * Test of generarPrimos method, of class CribaEratostenes.
     * Voy a comentar cada test porque auunque se entiendan es una tarea y lo veo
     * conveniente
     */
    @Test
    public void testGenerarPrimos1() {
        System.out.println("generarPrimos");
        int max = 0;
        int[] expResult = {};
        
        int[] result = CribaEratostenes.generarPrimos(max);
        assertArrayEquals(expResult, result);
       
    }
    @Test
    public void testGenerarPrimos2() {
        System.out.println("generarPrimos");
        int max = 2;
        int[] expResult = {2};
        int[] result = CribaEratostenes.generarPrimos(max);
        assertArrayEquals(expResult, result);
       
    }
    @Test
    public void testGenerarPrimos3() {
        System.out.println("generarPrimos");
        int max = 3;
        int[] expResult = {2,3};
        int[] result = CribaEratostenes.generarPrimos(max);
        assertArrayEquals(expResult, result);
       
    }
    @Test
    public void testGenerarPrimos4() {
        System.out.println("generarPrimos");
        int max = 100;
        int[] expResult = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,
        71,73,79,83,89,97};
        int[] result = CribaEratostenes.generarPrimos(max);
        assertArrayEquals(expResult, result);
       
    }
}
