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
public class Excercise12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        double x=0;
        double answer;
        
        try{
            System.out.println("Enter a double");
            x = Double.parseDouble(dataIn.readLine());
	}catch( IOException | NumberFormatException e ){
            System.out.println("Error! "+e.getMessage());
	}
        
        answer = Math.log(x)/Math.log(2);
        System.out.println("Base 2 log of "+x+" is "+answer);
    } 
}
