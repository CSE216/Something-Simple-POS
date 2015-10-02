/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somethingsimplepos;
import java.util.LinkedList;

/**
 *
 * @author srule_000
 */
 
public class Sale extends Transaction { 
   
    private String paymenttype;
    private LinkedList<Product> saleItems;
    private Product currentProduct;
    
    public void removeItem(int itemId){
        
    }
    
    public double getTotal(){
        return 0.0;
    }
    
    public void makeLineItem(int itemId, int quantity){
        currentProduct = new Product(itemId, quantity);
        saleItems.add(currentProduct);
    }
    
    public void makePayment(double amountTendered, String paymenttype){
        this.paymenttype=paymenttype;
    }
   
}
