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
public class Excercise18 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        float PpackageA=0;
        float PpackageB=0;
        float LpackageA=0;
        float LpackageB=0;
        float CPpoundA;
        float CPpoundB;
        
        try{
            System.out.println("Price per pound package A:  ");
            PpackageA = Float.parseFloat(dataIn.readLine());
            System.out.println("Percent lean package A: ");
            LpackageA = Float.parseFloat(dataIn.readLine());
            System.out.println("Price per pound package B: ");
            PpackageB = Float.parseFloat(dataIn.readLine());
            System.out.println("Percent lean package B: ");
            LpackageB = Float.parseFloat(dataIn.readLine());
	}catch( IOException | NumberFormatException e ){
            System.out.println("Error!");
	}
            
        CPpoundA = PpackageA/(LpackageA/100);
        CPpoundB = PpackageB/(LpackageB/100);
        
        System.out.println("Package A cost per pound of lean: "+CPpoundA);
        System.out.println("Package B cost per pound of lean: "+CPpoundB);
        if(CPpoundA<CPpoundB)
            System.out.println("Package A is the best value");
        else if(CPpoundA>CPpoundB)
            System.out.println("Package B is the best value");
    } 
}
