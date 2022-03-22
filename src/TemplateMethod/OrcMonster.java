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
public class OrcMonster  extends IAMonster{

    @Override
    protected void loadCommands() {
        System.out.println("Loading Orc Commands...");
    }

    @Override
    protected void loadSkills() {
        System.out.println("Atack | Jump Atack | Fury");
    }
    
}
