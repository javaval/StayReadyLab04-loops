package com.codedifferently.stayready.lab04;

import java.util.Scanner;  


public class CarRide {

    public String str = "Are we there yet?"; //init string 
    Scanner sc = new Scanner(System.in); // set up of scanner object for user input

    //areWeThereYet returns a string...debated if it should just return void. no arguments accepted.
    public String areWeThereYet(){
        //prints a message out to the user
        System.out.println(str);
        //begin loop, this while the user input is not yes;while isYes != true. 

        while(isYes(sc.nextLine()) != true){  
            //it'll keep asking are we there yet 
            System.out.println(str);
            //it'll keep asking for user input 
            String reAsk = sc.nextLine();
            //it'll keep evaluating the user input as true or false.
            isYes(reAsk);
        } 
        //finally returns str
        return str;
    }
    
    public boolean isYes(String input){ //helper function
        String neccesaryCon = "Yes";    //condition to return true

        if(neccesaryCon.equals(input)){
            str = "Good"; // public string is reassigned to "Good"
            return true;
        }
        return false; //this second return works like an else statement...
    }

    public static void main(String[] args){
        CarRide carRide = new CarRide();
        //Printing out return value from areWeThereYet();
        System.out.println(carRide.areWeThereYet());
    }

}
