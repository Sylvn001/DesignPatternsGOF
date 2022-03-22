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
public abstract class IAMonster {
    public void start(){
        loadCommands();
        downloadAdditionalFiles();
        cleanCache();
        loadSkills();
        startFight();
    }

    protected abstract void loadCommands();

    protected final void downloadAdditionalFiles() {
        System.out.println("Dowloading Files..");
    }

    protected abstract void loadSkills();

    protected final void startFight() {
        System.out.println("Fighting!!");
    }

    protected final void cleanCache(){
        System.out.println("Cleaning cache..");
    }
}
