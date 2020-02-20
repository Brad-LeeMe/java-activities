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
public class Excercise36 {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int N=0;
        
        try{
            System.out.println("Initial number of stars: ");
            N = Integer.parseInt(dataIn.readLine());
        }catch( IOException | NumberFormatException e ){
           System.out.println("Error! " +e.getMessage());
        }
        
        for(int i=N;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }  
}
