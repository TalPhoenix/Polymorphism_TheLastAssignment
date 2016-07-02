/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.Graphics;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author taloh
 */
public class ShapesTest {

    private Graphics g;
    
    public ShapesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Draw method, of class Shapes.
     */
    @Test
    public void testDraw() {
        System.out.println("Draw");
        Graphics g = null;
        int x = 0;
        int y = 0;
        Shapes instance = new Shapes(x, y);
        instance.Draw(g, x, y);
        
    }
    
}
