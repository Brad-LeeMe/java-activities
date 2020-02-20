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
public class Excercise15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        final int boltPrice=5;
        final int nutPrice=3;
        final int washerPrice=1;
        int bolt=0;
        int nut=0;
        int washer=0;
        int cost;
        
        try{
            System.out.println("Number of bolts: ");
            bolt = Integer.parseInt(dataIn.readLine());   
            System.out.println("Number of nuts: ");
            nut = Integer.parseInt(dataIn.readLine());
            System.out.println("Number of washers: ");
            washer = Integer.parseInt(dataIn.readLine());
            if(bolt<0||nut<0||washer<0)
                throw new IOException("One or more value is invalid/negative");
	}catch( IOException | NumberFormatException e ){
            System.out.println("Error! " +e.getMessage());
            System.exit(0);
	}
        
        if(bolt>nut){
            System.out.println("Check the Order!");
        }else{
            System.out.println("Order is OK.");
        }
        
        cost = bolt*boltPrice + nut*nutPrice + washer*washerPrice;
            
        System.out.println("\nTotal cost: "+cost);
    } 
}
