package somethingsimplepos;
import java.util.ArrayList;
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
    private Store store;
    private ArrayList<Sale> suspendedSales; 
    
    public Register(int userId, int regId, Store store) {
        catalog = store.getCatalog();
        this.userId = userId;
        this.regId = regId;
        this.store = store;
        suspendedSales = new ArrayList<Sale>();
    }
    
    public void makeNewSale(){
        if(currentSale!=null){
            currentSale = new Sale();
        }
        else{
            System.out.println("Sale in progress, cannot create new sale.");
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
        String desc = "Removed " + itemLookup(itemId);
        System.out.println(desc);
    }
    
    public String itemLookup(int itemId){
        return catalog.getProductDescription(itemId);
    }
    
    public void printReceipt(){
        if(currentSale.isComplete() == true){
            Receipt receipt = new Receipt(currentSale);
            receipt.createReceipt(userId, store);
        }
    }
    
    public void suspendSale(){
        suspendedSales.add(currentSale);
        System.out.println("Sale successfully suspended, sale ID is: " + suspendedSales.indexOf(currentSale));
        currentSale = null;
    }
    
    public void listSales(){
        for(int i=0; i<suspendedSales.size(); i++){
            System.out.println("Sale ID: " + i);
        }
    }
    public void resumeSale(int saleId){
        if(currentSale != null){
            System.out.println("Please finish or suspend current sale before continuing.");
        }
        else{
            currentSale = suspendedSales.get(saleId);
            suspendedSales.remove(currentSale);
        }    
    }
    
    public void managerOverride(int userId){
        //test if userId matches a manager 
        if (true){
        this.userId = userId;
        }
        else{
            System.out.println("Override Error: Please enter a valid manager ID.");
        }
    }
    
    public String toString(){
        return "Register ID: " + regId + "  Store: " + store.getName();
    }
}
