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
public class Excercise27 {
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
        int checkFront;
        int checkRear;
        boolean goodPressure=true;
        
        try{
            System.out.println("Input right front pressure");
            frontR = Integer.parseInt(dataIn.readLine());
            if(frontR<35 || frontR>45){
                goodPressure=false;
                System.out.println("Warning: pressure is out of range");
            }       
            System.out.println("Input left front pressure");
            frontL = Integer.parseInt(dataIn.readLine());
            if(frontL<35 || frontL>45){
                goodPressure=false;
                System.out.println("Warning: pressure is out of range");
            }     
            System.out.println("Input right rear pressure");
            rearR = Integer.parseInt(dataIn.readLine());
            if(rearR<35 || rearR>45){
                goodPressure=false;
                System.out.println("Warning: pressure is out of range");
            }        
            System.out.println("Input left rear pressure");
            rearL = Integer.parseInt(dataIn.readLine());
            if(rearL<35 || rearL>45){
                goodPressure=false;
            }
	}catch( IOException | NumberFormatException e ){
            System.out.println("Error! " +e.getMessage());
            System.exit(0);
	}
            
        checkFront = Math.abs(frontR-frontL);
        checkRear = Math.abs(rearR-rearL);    
        if( checkFront<4 && checkRear<4 && goodPressure==true)
            System.out.println("Inflation is OK");
        else
            System.out.println("Inflation is BAD");
        
        
    }    
}
