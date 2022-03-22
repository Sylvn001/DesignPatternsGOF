/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author junior
 */
public class Subscriber implements Observer {
    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }
    
    @Override
    public void update(){
        System.out.println("Hello! " + name + " a new Video is uploaded: " + channel.getTitle());
    }
    
    @Override
    public void subscribeChannel(Channel ch){
        channel = ch;
    }
    
}
