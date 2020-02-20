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
public class Excercise24 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        float checking=0;
        float savings=0;
        double serviceCharge=0;
        String msg;
        
        try{
            System.out.println("Checking account balance($): ");
            checking = Float.parseFloat(dataIn.readLine());
            System.out.println("Savings account balance($): ");
            savings = Float.parseFloat(dataIn.readLine());
	}catch( IOException | NumberFormatException e ){
            System.out.println("Error! " +e.getMessage());
            System.exit(0);
	}
        if(checking>1000 || savings>1500)
            serviceCharge = 0;
        else
            serviceCharge =serviceCharge + 0.15;
        
        msg="The service charge is $"+serviceCharge;
        System.out.println(msg);
        
    } 
}
