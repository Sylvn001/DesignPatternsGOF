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
public class Vector extends Renderer {

    public Vector(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.print(" ---- ---- --- --- (VECTOR)");
        this.shape.drawShape();
    }
    
}
