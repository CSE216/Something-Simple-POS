package somethingsimplepos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jess
 */
public class Register {
    private int userId;
    private int regId;
    private ProductCatalog catalog; 
    private Sale currentSale;
    
    public Register(int userId, int regId) {
        catalog = ProductCatalog.getInstance();
        this.userId = userId;
        this.regId = regId;
    }
    
    public void makeNewSale(){
        if(currentSale!=null){
        currentSale = new Sale();
        }
    }
    
    public void enterItem(int itemId, int quantity){
        currentSale.makeLineItem(itemId, quantity);
    }
    
    public double makePayment(double amountTendered, String paymentType){
        currentSale.makePayment(amountTendered,paymentType);
        return amountTendered - getTotal();
    }
    
    public void endSale(){
        currentSale.setComplete(); 
        currentSale = null;
    }
    
    public double getTotal(){
        return currentSale.getTotal();
    }
    
    public void cancelItem(int itemId){
        currentSale.removeItem(itemId);
    }
    
    public void printReceipt(){
        
    }
    
    public void suspendSale(){
 
    }
    
    public void resumeSale(){

    }
    
    public void managerOverride(int managerId){
   
    }
}
