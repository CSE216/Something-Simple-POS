/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somethingsimplepos;

/**
 *
 * @author Pablo
 */
public class UserHandler {
    private User user;
    private Register register;
    
    public UserHandler(User user) {
        this.user = user;
        register = new Register(user.getId());
    }
    
    public void startSale(){
        user.makeNewSale();
    }
    
    public void endSale(){
        user.endSale();
        user = null;
    }
    
    
}
