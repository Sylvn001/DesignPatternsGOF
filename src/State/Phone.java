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
public class Phone {
    private State state;
    
    Phone(){
        this.state = new TurnOffState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
    public void toggleDownButton(){
        this.state.downButton();
    }
    
    public void toggleTopButton(){
        this.state.topButton();
    }
    
    public void toggleOffButton(){
        this.state.offButton(this);
    }
    
    public void toggleUnlock(){
        this.state.unlock(this);
    }
    
}
