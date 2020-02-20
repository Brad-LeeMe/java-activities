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
public class Excercise43 {
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int month = 0;
        double effectiveness=100;
        double x=4;
        double percent = x/100;
        do{
            System.out.print("month: "+month+"\t");
            System.out.println("effectiveness: "+effectiveness);
            effectiveness=effectiveness-effectiveness*percent;
            month = month+1;
        }while(effectiveness>50);
        
        System.out.print("month: "+month+"\t");
        System.out.println("effectiveness: "+effectiveness+" DISCARDED");
    }  
}
