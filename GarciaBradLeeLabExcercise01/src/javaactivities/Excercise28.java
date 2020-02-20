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
public class Excercise28 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int startV=0;
        int endV=0;
        
        try{
            System.out.println("Enter Start:");
            startV = Integer.parseInt(dataIn.readLine());
            System.out.println("Enter End:");
            endV = Integer.parseInt(dataIn.readLine());
	}catch( IOException | NumberFormatException e ){
            System.out.println("Error! " +e.getMessage());
	}
        
        System.out.println("");
        while(startV<=endV){
            System.out.println(startV);
            startV++;
        }
    }    
}
