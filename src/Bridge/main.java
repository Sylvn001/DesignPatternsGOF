/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author junior
 */
public class main {
    public static void main(String args[]){
        //Shapes
        SquareShape square = new SquareShape();
        CircleShape circle = new CircleShape();
        LineShape line = new LineShape();
        
        //Pencils (Renderer)
        Vector vectorPencil = new Vector(square);
        Pixel pixelPencil = new Pixel(circle);
        
        vectorPencil.draw();
        System.out.println("");
        
        pixelPencil.draw();
        
        pixelPencil.setShape(line);
        pixelPencil.draw();
        
    }
}
