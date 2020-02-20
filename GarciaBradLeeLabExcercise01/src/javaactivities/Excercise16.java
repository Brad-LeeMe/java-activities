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
public class Excercise16 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        int capacity=0;
        int percentage=0;
        int consumedGas=0;
        int miles;
        
        try{
            System.out.println("Tank capacity:");
            capacity = Integer.parseInt(dataIn.readLine());
            System.out.println("Gage reading:");
            percentage = Integer.parseInt(dataIn.readLine());
            System.out.println("Miles per gallon:");
            consumedGas = Integer.parseInt(dataIn.readLine());
	}catch( IOException | NumberFormatException e ){
            System.out.println("Error! "+e.getMessage());
	}
        
        miles= capacity*percentage*consumedGas/100;
        if(miles<200)
            System.out.println("Get Gas!");
        else
            System.out.println("Safe to Proceed.");
    } 
}
