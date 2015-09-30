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
 
public class Sale extends Transaction { 
   
    String paymenttype;
    
    public void removeItem(int itemId){
        
    }
    
    public double getTotal(){
        return 0.0;
    }
    
    public void makeLineItem(int itemId, int quantity){
      
        
    }
    
    public void makePayment(double amountTendered, String paymenttype){
        this.paymenttype=paymenttype;
    }
   
}
