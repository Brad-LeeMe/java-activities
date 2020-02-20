/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaactivities;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// @author test 001
public class Excercise08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int totalcents=0;
        int dollar;
        int quarter;
        int dime;
        int nickel;
        
        try{
                System.out.println("Your total change in cents:");
                totalcents = Integer.parseInt(dataIn.readLine());
        }catch( IOException | NumberFormatException e ){
                System.out.println("Error!");
	}
        
        dollar = totalcents/100;
        totalcents = totalcents%100;
        quarter = totalcents/25;
        totalcents = totalcents%25;
        dime = totalcents/10;
        totalcents = totalcents%10;
        nickel = totalcents/5;
        totalcents = totalcents%5;
        
        System.out.print("Your change is: ");
        switch (dollar) {
            case 1:
                System.out.print(dollar+" dollar, ");
                break;
            case 0:
                System.out.print("");
                break;
            default:
                System.out.print(dollar+" dollars, ");
                break;
        }
        switch (quarter) {
            case 1:
                System.out.print(quarter+" quarter, ");
                break;
            case 0:
                System.out.print("");
                break;
            default:
                System.out.print(quarter+" quarters, ");
                break;
        }
        switch (dime) {
            case 1:
                System.out.print(dime+" dime, ");
                break;
            case 0:
                System.out.print("");
                break;
            default:
                System.out.print(dime+" dimes, ");
                break;
        }
        switch (nickel) {
            case 1:
                System.out.print(nickel+" nickel, ");
                break;
            case 0:
                System.out.print("");
                break;
            default:
                System.out.print(nickel+" nickels, ");
                break;
        }
        switch (totalcents) {
            case 1:
                System.out.print("and "+totalcents+" penny ");
                break;
            case 0:
                System.out.print("");
                break;
            default:
                System.out.print("and "+totalcents+" pennies ");
                break;
        }
    } 
}
