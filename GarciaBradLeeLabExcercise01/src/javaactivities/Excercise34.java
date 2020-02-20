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
public class Excercise34 {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        int N=0;
        int squareSum=0;
        int cubeSum=0;
        
        try{
            System.out.println("Enter N");
            N = Integer.parseInt(dataIn.readLine());
        }catch( IOException | NumberFormatException e ){
           System.out.println("Error! " +e.getMessage());
        }
        
        for(int i=1;i<=N;i++){
           squareSum=squareSum+i*i;
           cubeSum=cubeSum+i*i*i;
        }
        
        System.out.println("The sum of the squares: "+squareSum);
        System.out.println("The sum of the cubes: "+cubeSum);
        
        squareSum = (N*(N+1)*(2*N+1)/6);
        cubeSum = N*N*(N+1)*(N+1)/4;
        
        System.out.println("The sum of the squares using formula: "+squareSum);
        System.out.println("The sum of the cubes using formula: "+cubeSum );
    }  
}
