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
public class ProductCatalog {

    static ProductCatalog instance;

    private ProductCatalog() {
        
    }

    public static synchronized ProductCatalog getInstance() {
        if (instance == null) {
            instance = new ProductCatalog();
        }
        return instance;
    }
    
    public String getProductDescription(){
        return null;
    }
}
