/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somethingsimplepos;

/**
 *
 * @author adingreenwald
 */
public abstract class User {
    public Register register;
    public String name;
    public int id;

    public User(String name, int id) {
        //register = new Register(id);
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    public void makeNewSale(){
        Sale sale = new Sale();
        
    }
    
    public void enterItem(){
        //Product product = new Product();
        
    }
    
    public void endSale(){
        
    }
}
