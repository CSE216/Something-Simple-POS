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
public class Store {
    
    private String address;
    private String name;
    private ProductCatalog catalog;
    
    public Store(String address, String name, ProductCatalog catalog){
        this.address = address;
        this.name = name;
        this.catalog = catalog;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getName(){
        return name;
    }
    
    public ProductCatalog getCatalog(){
        return catalog;
    }
    
}
