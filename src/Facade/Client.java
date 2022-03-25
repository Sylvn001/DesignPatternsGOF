/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author junior
 */
public class Client {
    public static void main(String args[]){
        Facade facade = new Facade();
        
        facade.generatePrintRequest();
        
    }
}
