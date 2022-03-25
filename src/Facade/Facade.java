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
public class Facade {

    void generatePrintRequest() {
        Customer customer1 = new Customer();
        PrintShop ps = new PrintShop();
        Payment payment = new Payment();
        
        //in this case you can use conditionals, functions, and another abstractions or layers 
        //this is a basic example for you understand how use facade and another classes to encapsule complexivity
        customer1.requestPrint();
        ps.produceNewPrint();
        payment.processPayment(200);
        
        ps.goodbye();
        customer1.goodbye();
      
    }
    
}
