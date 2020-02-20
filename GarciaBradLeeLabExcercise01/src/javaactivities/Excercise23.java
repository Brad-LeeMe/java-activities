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
public class Excercise23 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int str=0;
        int hp=0;
        int lck=0;
        String msg, name="";
        
        System.out.println("Welcome to Immortal's Quest ");
        try{
            System.out.println("Enter the name of your character: ");
            name = dataIn.readLine();
            System.out.println("Enter strength (1-10): ");
            str = Integer.parseInt(dataIn.readLine());
            System.out.println("Enter health (1-10): ");
            hp = Integer.parseInt(dataIn.readLine());
            System.out.println("Enter luck (1-10): ");
            lck = Integer.parseInt(dataIn.readLine());
            if(str<1||str>10 || hp<1||hp>10 || lck<1||lck>10)
                throw new IOException("Invalid input in one or more item");
	}catch( IOException | NumberFormatException e ){
            System.out.println("Error!" + e.getMessage());
            System.exit(0);
	}

        if((str+hp+lck)>15)
            msg="You have give your character too many points!  Default values have been assigned: ";
        else
            msg="Character creation success!";
        
        msg= msg+"\n"+ name+", "+"strength: "+str+", "+"health: "+hp+", "+"luck: "+lck;
        System.out.println(msg);
        
    } 
}
