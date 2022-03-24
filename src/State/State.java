/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author junior
 */
public interface State {
    public void topButton();
    public void downButton();
    public void offButton(Phone phone);
    public void unlock(Phone phone);
}
