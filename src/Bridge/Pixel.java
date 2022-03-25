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
public class Pixel extends Renderer{

    public Pixel(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.print("* ** * * ** *** * ** * * PIXEL (or a young account in tw****r)");
        this.shape.drawShape();
    }
    
}
