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
public class Polygon extends Shapes{
    
    public Polygon(int w, int h) {
        super(w, h);
    }

   // public Polygon(int y, int z, int x) {
      //z[] = {55, 67, 109, 73, 83, 55, 27, 37, 1, 43};
      //y[] = {0, 36, 36, 54, 96, 72, 96, 54, 36, 36};
    //}
    
     public void Draw(Graphics g, int x){
      int z[] = {55, 67, 109, 73, 83, 55, 27, 37, 1, 43};
      int y[] = {0, 36, 36, 54, 96, 72, 96, 54, 36, 36};
      g.drawPolygon(y, z, x);
      g.setColor(Color.BLACK);
      g.fillPolygon(y, z, x);
  }
}
