/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author junior
 */
public class App {
    public static void main (String args[]){
        Phone phone = new Phone();
        
        phone.toggleDownButton(); //initial state = off
        phone.toggleTopButton();
        phone.toggleUnlock();
        phone.toggleOffButton(); //Change state to locked
        
        System.out.println("");
        phone.toggleDownButton();
        phone.toggleTopButton();
        phone.toggleUnlock(); //change state to unlocked
        
        System.out.println("");
        phone.toggleTopButton(); 
        phone.toggleDownButton();
        phone.toggleUnlock();
        phone.toggleOffButton(); //change state to locked

        System.out.println("");
        phone.toggleTopButton();
        phone.toggleOffButton(); //change state to turn off

        System.out.println("");
        phone.toggleOffButton(); //change state to blocked
        phone.toggleUnlock(); //change state to unlocked
    }
}
