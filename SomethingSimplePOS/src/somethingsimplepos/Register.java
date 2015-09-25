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
        if((currentSale!=null) || (currentSale.isComplete() == true)){
        currentSale = new Sale();
        }
    }
    
    public void enterItem(int itemId, int quantity){
        currentSale.makeLineItem(itemId, quantity);
    }
    
    public double makePayment(double amountTendered, String paymentType){
        currentSale.makePayment(amountTendered);
        return amountTendered - getTotalTax();
    }
    
    public void endSale(){
        currentSale.setComplete(); //Sale method for end of sale needed
        //inform database class that sale has ended?
    }
    
    public double getTotal(){
        double total = currentSale.getTotal();
        return total;
    }
    
    public double getTotalTax(){
        return currentSale.getTotal()*1.06;
    }
    
    public void cancelItem(int itemId){
        currentSale.removeItem(itemId);
    }
    
    public String printReceipt(){
        return "";
    }
    
    public void suspendSale(){
        //suspend current sale
    }
    
    public void resumeSale(){
        //resume current sale
    }
    
    public void managerOverride(int managerId){
        //handle manager override 
    }
}
