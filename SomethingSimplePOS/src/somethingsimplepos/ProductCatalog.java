/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somethingsimplepos;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 *
 * @author Pablo
 */
public class ProductCatalog {

    static ProductCatalog instance;
    private ArrayList<ProductDesc> catalog = new ArrayList<ProductDesc>();

    private ProductCatalog() {
        try{
            fillCatalog();
        }
        catch(FileNotFoundException e){
            System.err.println("File not found");
        }
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
    
    private void fillCatalog()throws FileNotFoundException{
        File inFile = new File("ProductCatalog.txt");
        Scanner sc = new Scanner(inFile);
        while(sc.hasNext()){
            int id = sc.nextInt();
            String desc = sc.next();
            Double price = sc.nextDouble();
            catalog.add(new ProductDesc(id, desc, price));
          }
     }
}
