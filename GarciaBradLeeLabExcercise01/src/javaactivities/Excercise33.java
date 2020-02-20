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
public class Excercise33 {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int N=0;
        double sum=0;
        double sum2=0;
        double num;
        double num2;
        double avg;
        double avg2;
        double SD;
        
        try{
            System.out.println("Enter N");
            N = Integer.parseInt(dataIn.readLine());
            for(int i=0;i<N;i++){
                System.out.println("Enter a number: ");
                num=Integer.parseInt(dataIn.readLine());
                sum=sum+num;
                num2=Math.pow(num, 2);
                sum2=sum2+num2;
            }
        }catch( IOException | NumberFormatException e ){
           System.out.println("Error! " +e.getMessage());
        }
        
        avg=sum/N;
        avg2=sum2/N;
        
        SD = Math.sqrt(avg2-Math.pow(avg, 2));
        System.out.println("The standard deviation is: "+SD);
    }  
}
