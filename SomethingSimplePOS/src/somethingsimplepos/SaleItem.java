/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somethingsimplepos;

/**
 *
 * @author ryanfitzgerald
 */
public class SaleItem {
    private int id;
    private int quantity;
    private ProductDesc desc;
  
    public SaleItem(int id,int quantity){
        this.id=id;
        this.quantity = quantity;
        
    }
    
    public double getSubtotal(){
        return quantity * desc.getPrice();
    }
    
}
