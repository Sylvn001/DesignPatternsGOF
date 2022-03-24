/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author junior
 */
public class Main {
    public static void main(String args[]){
        //Singleton singleton = new Singleton();//If you try instance a new singleton class using the constructor, you get a error. 
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton2); 
        
        /* variables singleton and singleton2 use the same instances*/
    }
}
