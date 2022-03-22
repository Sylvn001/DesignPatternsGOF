/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author Aluno
 */
public class Context {
    public State state; 
    
    public void changeState(String status){
        if(status == "pago"){
            this.state = new PaidOut();
        }else if(status == "pendente"){
            this.state = new Pending();
        }else{
            this.state = new Canceled();
        }
    }
    
    public void handle(){
        this.state.handle();
    }
}
