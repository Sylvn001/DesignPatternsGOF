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
public class Main {
    public static void main(String args[]){
        Human human = new Human();
        human.ride(5);
        human.ride(200);
        human.ride(600);
    }
}
