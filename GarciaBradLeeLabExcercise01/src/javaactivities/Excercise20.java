/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaactivities;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author test 001
 */
public class Excercise20 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        float price=0;
        float shipCost;
        String item="";
        boolean isOvernight=false;
        
        try{
            System.out.println("Enter the item: ");
            item = dataIn.readLine();
            System.out.println("Enter the price: ");
            price = Float.parseFloat(dataIn.readLine());
            System.out.println("Overnight delivery? (0==no, 1==yes)");
            int ans = Integer.parseInt(dataIn.readLine());
            switch (ans) {
                case 0:
                    isOvernight = false;
                    break;
                case 1:
                    isOvernight = true;
                    break;
                default:
                    throw new IOException("Not valid answer!");
            }
	}catch( IOException | NumberFormatException e ){
            System.out.println("Error! "+e.getMessage());
            System.exit(0);
	}
        
        price = price/100;
        if(price<10){
            if(isOvernight == true)
                shipCost=7;
            else
                shipCost=2;
        }else{
            if(isOvernight == true)
                shipCost=8;
            else
                shipCost=3;
        }
            
        System.out.println("\nInvoice:");
        System.out.println(" "+item+"\t"+price);
        System.out.println(" shipping\t" +shipCost);
        System.out.println(" total\t"+(price+shipCost));   
    } 
}
