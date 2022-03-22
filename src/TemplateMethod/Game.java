/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod;

/**
 *
 * @author junior
 */
public class Game {
    public static void main(String args[]){
        OrcMonster orc1 = new OrcMonster();
        DragonMonster dragon1 = new DragonMonster();
        
        orc1.start();
        System.out.println("");
        dragon1.start();
    }
}
