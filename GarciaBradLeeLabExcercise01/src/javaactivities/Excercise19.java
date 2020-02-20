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
public class Excercise19 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        int birthYear=0;
        int nowYear=0;
        int age;
        System.out.println("Input TWO digit number only.");
        
        try{
            System.out.println("Year of Birth: ");
            birthYear = Integer.parseInt(dataIn.readLine());
                String x = Integer.toString(birthYear);
                boolean isTwoDigits = x.length()==2;
                if(isTwoDigits == false && birthYear>9)
                    throw new IOException("Number is not 2 digits!");
            System.out.println("Current year: ");
            nowYear = Integer.parseInt(dataIn.readLine());
                x = Integer.toString(birthYear);
                isTwoDigits = x.length()==2;
                if(isTwoDigits == false && nowYear>9 && birthYear>9)
                    throw new IOException("Number is not 2 digits!");
        }catch( IOException | NumberFormatException e ){
            System.out.println("Error! "+e.getMessage());
            System.exit(0);
        }
        
        if(nowYear>=birthYear)
            age = nowYear-birthYear;
        else
            age = 100+nowYear-birthYear;
        System.out.println("Your age "+age);
    } 
}
