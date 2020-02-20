/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaactivities;

import java.io.*;

/**
 *
 * @author test 001
 */
public class Excercise10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        float cost = 0;
        float kiloWattHour=0;
        float annualCost;
        
        try{
            System.out.println("Enter cost per kilowatt-hour in cents ");
            cost = Float.parseFloat(dataIn.readLine());
            if(cost<0)
                throw new IOException("Invalid cost amount");
            System.out.println("Enter kilowatt-hours used per year ");
            kiloWattHour = Float.parseFloat(dataIn.readLine());
            if(kiloWattHour<0)
                throw new IOException("Invalid consumption amount");
	}catch( IOException | NumberFormatException e ){
            System.out.println("Error! "+e.getMessage());
            System.exit(0);
	}
        
        annualCost = cost*kiloWattHour/100;
        System.out.println("Annual cost: "+annualCost+" dollars");
    } 
}
