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
public class Excercise29 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String inputString=""; 
        int times;
        
        try{
            System.out.println("Enter a word:");
            inputString = dataIn.readLine();
        }catch( IOException e ){
            System.out.println("Error! " +e.getMessage());
        }
        
        System.out.println("");
        times=inputString.length();
        for(int i=0;i<times;i++){
            System.out.println(inputString);
        }
        
    }
}
