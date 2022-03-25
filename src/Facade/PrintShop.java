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
public class PrintShop {
   Print print; 

    public PrintShop() {
        this.print = new Print();
    }
   
   public void produceNewPrint(){
       System.out.println("Hello Customer! we are printing...");
       this.print.processPrinting();
   }
   
   public void goodbye(){
       System.out.println("Thank you!! Goodbye");
   }
}
