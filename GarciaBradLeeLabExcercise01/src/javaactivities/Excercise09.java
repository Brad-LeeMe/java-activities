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
public class Excercise09 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int voltage=0;
        int resistance=0;
        double current;
        
        try{
            System.out.println("Input the voltage:");
            voltage = Integer.parseInt(dataIn.readLine());
            System.out.println("Input the resistance:");
            resistance = Integer.parseInt(dataIn.readLine());
        }catch( IOException | NumberFormatException e ){
            System.out.println("Error! "+e.getMessage());
        }
       
        current = (voltage+0.0)/resistance;
        System.out.println("The current is: "+current+" Amperes");

    }
}
