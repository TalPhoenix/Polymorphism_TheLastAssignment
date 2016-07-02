/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.Graphics;

/**
 *
 * @author taloh
 */
public class Line extends Shapes {
    
    public Line(int w, int h) {
        super(w, h);
    }
    
  @Override
  public void Draw(Graphics g, int x, int y){
      g.drawLine(x, y, Width, Height);
  }
    
}
