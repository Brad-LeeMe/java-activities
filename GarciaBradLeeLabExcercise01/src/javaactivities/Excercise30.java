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
public class Excercise30 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String word1="";
        String word2=""; 
        int count;
        
        try{
            System.out.println("Enter the first word:");
            word1 = dataIn.readLine();
            System.out.println("Enter the second word:");
            word2 = dataIn.readLine();
        }catch( IOException e ){
            System.out.println("Error! " +e.getMessage());
        }
            
        count=word1.length()+word2.length();
        System.out.print(word1);
        for(int i=count;i<30;i++){
            System.out.print(".");
        }
        System.out.println(word2);
        
    }
}
