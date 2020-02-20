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
public class Excercise11 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        double g= 32.174;
        double t=0;
        double distance;
        
        try{
            System.out.println("Enter the number of seconds ");
            t = Double.parseDouble(dataIn.readLine());
            if(t<0)
                throw new IOException("Invalid time input");
	}catch( IOException | NumberFormatException e ){
            System.out.println("Error! "+e.getMessage());
            System.exit(0);
	}
            
        distance= .5*g*t*t;
        System.out.println("Distance: " +distance+" feet");
    } 
}
