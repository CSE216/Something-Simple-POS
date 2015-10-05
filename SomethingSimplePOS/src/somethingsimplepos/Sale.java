/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somethingsimplepos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Sale extends Transaction {
    private LinkedList<Product> saleItems = new LinkedList<>();
    private Product currentProduct;
    private ArrayList<SaleItem> purchases = new ArrayList<SaleItem>();
    private String paymenttype;

    public void removeItem(int itemId) {
        int index = -9;
        index = purchases.indexOf(itemId);
        if (index != -9) {
            purchases.remove(itemId);
        } else {
            System.out.println("Not a valid itemId");
        }
    }
    public int getSaleSize(){
        return purchases.size();
    }
    
    public SaleItem getLineItem(int index){
        return purchases.get(index);
    }


    public double getTotal() {
        double total = 0;
        for (int i = 0; i < purchases.size(); i++) {
            total += purchases.get(i).getSubtotal();
        }
        return total;
    }

    public void makeLineItem(int itemId, int quantity) {
        currentProduct = new Product(itemId, quantity);
        saleItems.add(currentProduct);
        SaleItem item = new SaleItem(itemId, quantity);
        purchases.add(item);

    }

    public double makePayment(double amountTendered, String paymenttype) {
        this.paymenttype = paymenttype;
        setComplete();
        return amountTendered - getTotal();
    }

}
