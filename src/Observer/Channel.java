/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author junior
 */
public class Channel implements Subject {
    List<Subscriber> subs = new ArrayList<>();
    private String title;

    public String getTitle() {
        return title;
    }
    
    @Override
    public void subscribe(Subscriber sub){
        subs.add(sub);
    }
    
    @Override
    public void unSubscribe(Subscriber sub){
        subs.remove(sub);
    }
    
    @Override
    public void notifySubscribers(){
        for(Subscriber sub : subs){
            sub.update();
        }
    }
    
    @Override
    public void upload(String title){
        this.title = title;
        notifySubscribers();
    }
}
