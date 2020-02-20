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
public class Excercise42 {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int month = 1;
        double balance = 0;
        double mPayment = 0;
        double mInterest = 0;
        double tPayment = 0;
        
        try{
            System.out.println("Enter the beginning balance: ");
            balance = Double.parseDouble(dataIn.readLine());
            System.out.println("Enter the monthly interest: ");
            mInterest = Double.parseDouble(dataIn.readLine());
            System.out.println("Enter the monthly payment: ");
            mPayment = Double.parseDouble(dataIn.readLine());
        }catch( IOException | NumberFormatException e ){
           System.out.println("Error! " +e.getMessage());
           System.exit(0);
        }
        mInterest=mInterest/100;
        do{
            tPayment = tPayment+mPayment;
            System.out.println("month: " +month+"\t balance:"+ balance+"\t total payments: "+tPayment);
            balance = balance-mPayment+balance*mInterest;
            month++;
        }while(balance>=0);
        
        if(balance<0){
            tPayment=mPayment+balance+tPayment;
            balance=0;
            System.out.println("month: " +month+"\t balance:"+ balance+"\t total payments: "+tPayment);
        }
    }  
}
