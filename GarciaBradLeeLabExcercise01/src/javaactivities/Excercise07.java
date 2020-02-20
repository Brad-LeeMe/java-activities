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
public class Excercise07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int cents = 0;
        int dollars;
        int remainingCents;
        
        try{
            System.out.println("Input the number of cents:");
            cents = Integer.parseInt(dataIn.readLine());
	}catch( IOException | NumberFormatException e ){
                System.out.println("Error! "+e.getMessage());
	}
            
        dollars = cents/100;
        remainingCents = cents%100;
        System.out.println("That is "+dollars+" dollars and "+remainingCents+" cents.");
    } 
}
