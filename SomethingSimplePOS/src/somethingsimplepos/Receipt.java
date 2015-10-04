/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somethingsimplepos;
import java.io.File;
import java.lang.StringBuilder;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
/**
 *
 * @author Jess
 */
public class Receipt {
    private StringBuilder build;
    private DateFormat dateFormat;
    private String dateSale;
    private Sale sale;
    private static String blankLine = System.getProperty("line.separator");
    
    public Receipt(Sale sale){
        this.sale = sale;
        build = new StringBuilder();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
        Date date = new Date();
        dateSale = dateFormat.format(date);
    }
    
    public void createReceipt(int userId, Store store){
        String temp = store.getName() + blankLine + "Cashier: " + userId + blankLine;
        build.append(temp);
        temp = "Date of sale: " + dateSale + blankLine; 
        temp += blankLine + "Total: $" + sale.getTotal() + blankLine;
        temp += blankLine + "Thank you for shopping with us!";
        build.append(temp);
        temp = "Thank you for shopping with us!";
        try{
        printReceipt();
        }
        catch(IOException e){
            System.err.println("Error printing receipt");
        }
    }   
    
    private void printReceipt()throws IOException{
        File outFile = new File("receipt.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
        writer.write(build.toString());
        writer.close();
    }
}
