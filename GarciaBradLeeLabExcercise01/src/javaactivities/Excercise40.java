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
public class Excercise40 {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        float weight=0;
        float shipCost=0;
        
        do{
            try{
                System.out.println("Weight of Order:");
                weight = Float.parseFloat(dataIn.readLine());
                if(weight <= 0){
                    System.out.println("\nBye");
                    System.exit(0);
                }
            }catch( IOException | NumberFormatException e ){
               System.out.println("Error! " +e.getMessage());
            }
        
            if(weight<=10)
                shipCost=3;
            else{
                int x = (int) (weight-10);
                shipCost=(float)(3+0.25*x);
            }
            System.out.println("Shipping Cost: $"+shipCost+"\n");
        }while(weight>0);
    }  
}
