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
public class Excercise14 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int amount=0;
        int discountedPrice;
        
        try{
            System.out.println("Enter amount of purchases: ");
            amount = Integer.parseInt(dataIn.readLine());
	}catch( IOException | NumberFormatException e ){
            System.out.println("Error! "+e.getMessage());
	}
        
        discountedPrice = amount-(amount/10);
        System.out.println("Discounted price: "+discountedPrice);
    } 
}
