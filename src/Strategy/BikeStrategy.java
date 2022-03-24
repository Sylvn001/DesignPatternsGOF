/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author junior
 */
public class BikeStrategy implements Strategy{

    @Override
    public void goToLocation() {
        System.out.println("Running with my BIKE");
    }
    
}
