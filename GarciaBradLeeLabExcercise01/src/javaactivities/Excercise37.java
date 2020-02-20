/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaactivities;
/**
 *
 * @author test 001
 */
public class Excercise37 {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=9;
        
        for(int i=x;i>=0;i--){
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for(int j=0;j!=(-2*i+(2*x+1));j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for(int j=1;j<x;j++){
            System.out.print(" ");
        }
        System.out.print("***\n");
        for(int j=1;j<x;j++){
            System.out.print(" ");
        }
        System.out.print("***\n");
        for(int j=1;j<x;j++){
            System.out.print(" ");
        }
        System.out.print("***\n");
        
    }
}
