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
public class Product {
    private ProductDesc description;
    private int quantity;

    public Product(ProductDesc description, int quantity) {
        this.description = description;
        this.quantity = quantity;
    }
    
    public Product(int itemID, int quantity){
        description = new ProductDesc(itemID);
    }

    public ProductDesc getDescription() {
        return description;
    }

    public void setDescription(ProductDesc description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString(){
        return quantity + " " + description.toString();
    }
    
}
