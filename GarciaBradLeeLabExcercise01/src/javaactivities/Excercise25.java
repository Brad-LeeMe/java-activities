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
public class Excercise25 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        int frontR=0;
        int frontL=0;
        int rearR=0;
        int rearL=0;
        
        try{
            System.out.println("Input right front pressure");
            frontR = Integer.parseInt(dataIn.readLine());
            System.out.println("Input left front pressure");
            frontL = Integer.parseInt(dataIn.readLine());
            System.out.println("Input right rear pressure");
            rearR = Integer.parseInt(dataIn.readLine());
            System.out.println("Input left rear pressure");
            rearL = Integer.parseInt(dataIn.readLine());
	}catch( IOException | NumberFormatException e ){
            System.out.println("Error! " +e.getMessage());
            System.exit(0);
	}
        
        if(frontR==frontL && rearR==rearL)
            System.out.println("Inflation is OK");
        else
            System.out.println("Inflation is BAD");
    }    
}
