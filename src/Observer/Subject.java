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
public interface Subject {

    void notifySubscribers();

    void subscribe(Subscriber sub);

    void unSubscribe(Subscriber sub);

    void upload(String title);
    
}
