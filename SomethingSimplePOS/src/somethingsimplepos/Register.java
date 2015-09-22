package somethingsimplepos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pablo
 */
public class Register {
    public int userId;
    public ProductCatalog catalog;

    public Register(int userId) {
        catalog = ProductCatalog.getInstance();
        this.userId = userId;
    }
    
}
