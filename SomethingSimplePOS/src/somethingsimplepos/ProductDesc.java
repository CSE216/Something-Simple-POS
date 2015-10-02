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
public class ProductDesc{
    
    private ProductCatalog catalog;
    private int id;
    private String description;
    private double price;
    
    public ProductDesc(int id, String description, double price){
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public ProductDesc(int itemID) {
        getProductDescription(id);
    }
    
    private void getProductDescription(int id){
        description = catalog.getProductDescription(id);
        // use this method to get description and price of a product using the product id
    }
    
    public int getId(){
        return id;
    }
    
    public String getDescription(){
        return description;
    }
    
    public double getPrice(){
        return price;
    }
    
    @Override
    public String toString(){
        return "Product Id: " + id + "  Product Description: " + description + "   Price: " + price;
    }
    
}
