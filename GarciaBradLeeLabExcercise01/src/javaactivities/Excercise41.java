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
public class Excercise41 {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        int width;
        int height;
        int area;
        
        System.out.println("Computer Aided Design Program");
        try{
            System.out.println("First corner X coordinate: ");
            x1 = Integer.parseInt(dataIn.readLine());
            System.out.println("First corner y coordinate: ");
            y1 = Integer.parseInt(dataIn.readLine());
            System.out.println("Second corner X coordinate: ");
            x2 = Integer.parseInt(dataIn.readLine());
            System.out.println("Second corner Y coordinate: ");
            y2 = Integer.parseInt(dataIn.readLine());
        }catch( IOException | NumberFormatException e ){
           System.out.println("Error! " +e.getMessage());
        }
        
        width = Math.abs(x1-x2);
        height = Math.abs(y1-y2);
        area = width*height;
        if(width==0 || height==0) {
            System.out.println("END");
        } else
            System.out.println("Width: "+width+"  Height: "+height+"  Area: "+area);
    }  
}
