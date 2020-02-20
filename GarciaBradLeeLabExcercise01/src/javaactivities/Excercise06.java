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
public class Excercise06 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        double result;
        int radius = 0;
        
        try{
            System.out.println("Input the radius:");
            radius = Integer.parseInt(dataIn.readLine());
	}catch( IOException | NumberFormatException e ){
            System.out.println("Error! "+e.getMessage());
	}
        result = Math.PI*Math.pow(radius, 2.0);
        System.out.println("The radius is: "+ radius +" The area is: "+result);
    } 
}
