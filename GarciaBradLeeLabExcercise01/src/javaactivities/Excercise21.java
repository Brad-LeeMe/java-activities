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
public class Excercise21 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        float Tair=0;
        float Tsteam=0;
        float efficiency=0;
        
        try{
            System.out.println("Enter the air temperature: ");
            Tair = Float.parseFloat(dataIn.readLine());
            System.out.println("Enter the steam temperature: ");
            Tsteam = Float.parseFloat(dataIn.readLine());
	}catch( IOException | NumberFormatException e ){
            System.out.println("Error!"+e.getMessage());
	}
            
        if(Tsteam >=373)
            efficiency = 1 - Tair / Tsteam;
            
        efficiency = efficiency*100;
        System.out.println("The maximum possible efficiency of the engine is: "+ efficiency+"%");
    } 
}
