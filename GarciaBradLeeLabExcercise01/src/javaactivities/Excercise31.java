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
public class Excercise31 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        int numTBA;
        int total=0;
        int num;
        
        try{
            System.out.println("How many integers will be added: ");
            numTBA = Integer.parseInt(dataIn.readLine());
            for(int i=0;i<numTBA;i++){
                System.out.println("Enter an integer: ");
                num=Integer.parseInt(dataIn.readLine());
                total=total+num;
            }
        }catch( IOException | NumberFormatException e ){
            System.out.println("Error! " +e.getMessage());
        }
            
        System.out.println("The sum is "+total);
    }  
}
