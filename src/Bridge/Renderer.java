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
public abstract class Renderer {
   protected Shape shape;

    public Renderer(Shape shape) {
        this.shape = shape;
    }   

    protected Shape getShape() {
        return shape;
    }

    protected void setShape(Shape shape) {
        this.shape = shape;
    }
    
    public abstract void draw();
 
}
