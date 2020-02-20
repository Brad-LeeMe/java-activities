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
public class Excercise17 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        float weight=0;
        
        try{
            System.out.println("Enter your wieght in pounds: ");
            weight = Float.parseFloat(dataIn.readLine());
	}catch( IOException | NumberFormatException e ){
            System.out.println("Error! "+e.getMessage());
	}
            
        if(weight<=280 && weight>=220)
            System.out.println("You are allowed to participate in the contest!");
        else
            System.out.println("Sorry, you are not qualified to participate.");
        
    } 
}
