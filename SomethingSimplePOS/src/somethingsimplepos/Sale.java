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
 import java.util.*;
public class Sale extends Transaction { 
    ArrayList<SaleItem> purchases=new ArrayList<SaleItem>();
    String paymenttype;
    
    public void removeItem(int itemId){
        int index=-9;
        index=purchases.indexOf(itemId);
        if(index!=-9)
        {
        purchases.remove(itemId);
        }
        else
        {
        System.out.println("Not a valid itemId");
        }
        }
    
    
    public double getTotal(){
        double total=0;
        for(int i=0; i<purchases.size(); i++)
        {
        total+=purchases.get(i).getSubtotal();
        }
        return total;
    }
    
    public void makeLineItem(int itemId, int quantity){
      SaleItem item = new SaleItem(itemId,quantity);
       purchases.add (item);
        
    }
    
    public double makePayment(double amountTendered, String paymenttype){
        this.paymenttype=paymenttype;
        setComplete();
    return amountTendered - getTotal();
    }
   
}
