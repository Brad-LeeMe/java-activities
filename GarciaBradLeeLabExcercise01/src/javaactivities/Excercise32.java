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
public class Excercise32 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int N=0;
        double sum=0;
        
        try{
            System.out.println("Enter N");
            N = Integer.parseInt(dataIn.readLine());
        }catch( IOException | NumberFormatException e ){
           System.out.println("Error! " +e.getMessage());
        }
        
        for(int i=1;i<=N;i++){
            sum=sum+(1.0/i);
        }
        
        System.out.println("The sum is: "+sum);
    }  
}
