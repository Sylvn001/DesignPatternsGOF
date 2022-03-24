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
public class Human{
   private Strategy transport;

    public Strategy getTransport() {
        return transport;
    }

    public void setTransport(Strategy transport) {
        this.transport = transport;
    }
 
   public void ride(int distance){ //distance in KM
       if(distance <= 10)
        setTransport(new BikeStrategy());
       else if (distance <= 400)
        setTransport(new CarStrategy());
       else 
        setTransport(new AirplaneStrategy());
       
       getTransport().goToLocation();
   }
   
}
