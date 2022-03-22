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
public class Youtube {
    public static void main(String[] args){
        Channel thankYouTeluskoForKnowledge = new Channel();
        
        Subscriber s1 = new Subscriber("Junior Barros");
        Subscriber s2 = new Subscriber("Observer Pattern");
        Subscriber s3 = new Subscriber("Narutinho");
        
        thankYouTeluskoForKnowledge.subscribe(s1);
        thankYouTeluskoForKnowledge.subscribe(s2);
        thankYouTeluskoForKnowledge.subscribe(s3);
        
        s1.subscribeChannel(thankYouTeluskoForKnowledge);
        s2.subscribeChannel(thankYouTeluskoForKnowledge);
        s3.subscribeChannel(thankYouTeluskoForKnowledge);
        
        thankYouTeluskoForKnowledge.upload("Observer Design Pattern in Java");
    }
}
