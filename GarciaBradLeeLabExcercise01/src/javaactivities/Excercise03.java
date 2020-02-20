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
public class Excercise03 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int AprilRain = 12;
        int MayRain = 14;
        int JuneRain = 8;
        float AveRain = (float)((AprilRain+MayRain+JuneRain)/3);
        
        System.out.println("Rainfall for April:\t"+AprilRain);
        System.out.println("Rainfall for April:\t"+MayRain);
        System.out.println("Rainfall for April:\t"+JuneRain);
        System.out.println("Average rainfall:\t"+AveRain);   
    }
}
