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
public class Excercise39 {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int high;
        int low;
        int data=0;
        int sum1=0;
        int sum2=0;
        
        System.out.println("In-range Adder");
        try{
            System.out.println("Low end of range: ");
            low = Integer.parseInt(dataIn.readLine());
            System.out.println("High end of range: ");
            high = Integer.parseInt(dataIn.readLine());
            if(low>high)
                throw new IOException("Invalid range!");
            do{
                System.out.println("Enter data:");
                data = Integer.parseInt(dataIn.readLine());
                if(data<=high && data>=low)
                    sum1=sum1+data;
                sum2=sum2+data;
            }while(data!=0);
        }catch( IOException | NumberFormatException e ){
           System.out.println("Error! " +e.getMessage());
        }
        
        System.out.println("Sum of in range values: "+sum1);
        System.out.println("Sum of out of range values: "+sum2);

    }  
}
