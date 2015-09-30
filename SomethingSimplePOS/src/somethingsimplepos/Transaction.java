/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somethingsimplepos;

/**
 *
 * @author srule_000
 */
public class Transaction {
        public boolean isComplete=false;
         
    public boolean isComplete(){
        return isComplete;
    }
    
    public void setComplete(){
        isComplete=true;
    }
}
