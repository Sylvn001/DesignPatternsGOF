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
public class BlockedState implements State{

    @Override
    public void topButton() {
        System.out.println("Only emergency calls (police)");
    }

    @Override
    public void downButton() {
        System.out.println("Only emergency calls (Fire Force)");
    }

    @Override
    public void offButton(Phone phone) {
        phone.setState(new TurnOffState());
        System.out.println("I'm Locked but i'm are turning off....");
    }
    
    public void unlock(Phone phone){
        System.out.println("Unlocking...");
        phone.setState(new UnlockedState());
    }
    
}
