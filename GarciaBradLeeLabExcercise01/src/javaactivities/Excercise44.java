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
public class Excercise44 {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        double x=0;
        double term;
        double sum = 0;
        int n=0;
        
        try{
            System.out.println("Enter x: ");
            x = Double.parseDouble(dataIn.readLine());
        }catch( IOException | NumberFormatException e ){
            System.out.println("Error! " +e.getMessage());
            System.exit(0);
        }
        do{
            double fact=1;
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
            term = Math.pow(x, n)/fact;
            sum = sum + term; 
            System.out.println("n: "+n+"\t term: "+term+"\t\t sum: "+sum);
            n=n+1;
        }while(term>1.0E-12);
        
        System.out.println("my e^x: "+sum);
        double reale = Math.exp(x);
        System.out.println("Real e^x: "+reale);
    } 
}
