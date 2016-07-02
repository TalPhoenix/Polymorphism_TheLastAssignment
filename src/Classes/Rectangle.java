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
public class Rectangle extends Shapes{

    public Rectangle(int w, int h) {
        super(w, h);
        }
  @Override
  public void Draw(Graphics g, int x, int y){
      g.drawRect(x, y, Width, Height);
      g.setColor(Color.CYAN);
      g.fillRect(x, y, Width, Height);
      
  }
}
