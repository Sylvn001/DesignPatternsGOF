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
public class TurnOffState implements State{

    @Override
    public void topButton() {
        System.out.println("I'm OFF");
    }

    @Override
    public void downButton() {
        System.out.println("I'm OFF");
    }

    @Override
    public void offButton(Phone phone) {
        System.out.println("Loading....");
        phone.setState(new BlockedState());
    }

    @Override
    public void unlock(Phone phone) {
        System.out.println("I'm OFF");
    }
    
}
