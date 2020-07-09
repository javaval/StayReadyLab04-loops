package com.codedifferently.stayready.lab04;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;  //Java API for User Input and Output


public class CarRide {
    //Accpets no argument, returns a String
    public String areWeThereYet(){

        //New Scanner object, we're naming it "in"...this can be named anything. 
        Scanner in = new Scanner(System.in);

        //At the start of the program the user is asked "Are we there yet"
        System.out.println("Are we there yet?");

        //While is another form of loop, different from a for loop, it uses boolean 
        // logic and repeats until the condition is false. ... See Chapter 3, page 94 in Core Java

        // this line reads: while the user input is not (!) true, keep printing out "Are we there yet?"
        while(!expectedInput(in.nextLine())){
            System.out.println("Are we there yet?");
        }
        return "Thank Jesus!"; //issue, does not return after loop fails, just ends program
    }

    //returns true or false is the user input is the expected input
    public boolean expectedInput(String userIn){
        return userIn.equals("Yes"); //issue, what if the user says yes in lowercase
    }

    public static void main(String[] args){
        CarRide carRide = new CarRide();
        carRide.areWeThereYet();
    }



}
