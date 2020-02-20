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
public class Excercise22 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int itemNum=0;
        float heatTime=0;
        
        try{
            System.out.println("Enter number of items: ");
            itemNum = Integer.parseInt(dataIn.readLine());
            if(itemNum<0)
                throw new IOException("Invalid amount of item");
            System.out.println("Enter single-item heating time(second): ");
            heatTime = Float.parseFloat(dataIn.readLine());
	}catch( IOException | NumberFormatException e ){
            System.out.println("Error! "+e.getMessage());
	}
                
        if(itemNum>3)
            System.out.println("Heating more than three items at once is not recommended");
        if(itemNum==3)
            System.out.println("Recommended heating time is "+heatTime*2+" seconds");
        if(itemNum==2)
            System.out.println("Recommended heating time is "+(heatTime+heatTime/2)+" seconds");
        if(itemNum==1)
            System.out.println("Recommended heating time is "+heatTime+" seconds");
    } 
}
