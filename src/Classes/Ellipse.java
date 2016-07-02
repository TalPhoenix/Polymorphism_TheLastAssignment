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
public class Ellipse extends Shapes{
    
    public Ellipse(int w, int h) {
        super(w, h);
    }
    
   @Override
   public void Draw(Graphics g, int x, int y){
       g.drawOval(x, y, Width, Height);
       g.setColor(Color.gray);
       g.fillOval(x, y, Width, Height);
   }
}
 