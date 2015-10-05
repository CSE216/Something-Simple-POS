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
  
    public SaleItem(int id,int quantity, ProductDesc desc){
        this.id=id;
        this.quantity = quantity;
        this.desc = desc;
    }
    
    public double getSubtotal(){
        return quantity * desc.getPrice();
    }
    
    public int getId(){
        return id;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public String getDesc(){
        return desc.getDescription();
    }
    
    public String toString(){
        return "Item ID " + id + ": "+ getDesc() + ", Quantity: " +
                quantity + ", Subtotal: " + getSubtotal();
    }
    
}
