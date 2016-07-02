/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author taloh
 */
public class Shapes {
    int Width;
    int Height;
    
    public Shapes(int w, int h){
        Width = w;
        Height = h;
    }
    
    public void Draw(Graphics g, int x, int y){
        g.setColor(Color.CYAN);
    }
}
