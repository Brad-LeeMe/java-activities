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
public class Excercise38 {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        float initialM = 0;
        float finalM = 0;
        float gallon = 0;
        float total;
        
        try{
            System.out.println("Initial miles: ");
            initialM = Float.parseFloat(dataIn.readLine());
            if(initialM<0){
                System.out.println("bye");
                System.exit(0);
            }
            System.out.println("Final miles: ");
            finalM = Float.parseFloat(dataIn.readLine());
            System.out.println("Gallons ");
            gallon = Float.parseFloat(dataIn.readLine());
        }catch( IOException | NumberFormatException e ){
            System.out.println("Error! " +e.getMessage());
        }
        
        total=(finalM-initialM)/gallon;
        System.out.println("Miles per Gallon: "+total);
    }  
}
