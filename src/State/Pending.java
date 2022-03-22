/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.State;

/**
 *
 * @author Aluno
 */
public class Pending implements State{
    public Pending() {
    }
    
    @Override
    public void handle(){
        System.out.println("Pendente");
    }
}
