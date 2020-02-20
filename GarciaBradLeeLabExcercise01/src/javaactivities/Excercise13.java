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
public class Excercise13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        double x=0;
        double y=0;
        double Amean;
        double Hmean;
        
        try{
            System.out.println("Enter X");
            x = Double.parseDouble(dataIn.readLine());
            System.out.println("Enter Y");
            y = Double.parseDouble(dataIn.readLine());
	}catch( IOException | NumberFormatException e ){
            System.out.println("Error!");
	}
        Amean = (x+y)/2;
        Hmean = 2/(1/x + 1/y);
            
        System.out.println("Arithmetic mean: "+Amean);
        System.out.println("Harmonic mean: "+ Hmean);
    } 
}
