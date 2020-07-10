package com.codedifferently.stayready.lab04;

import java.util.Random;

public class Numbers {

    public String oneToTen(){
    	String output ="oneToTen()\n"
    				   +"*** Output ***";
    	for(int x=1; x<=10; x++){
    		output += "\n"+x;
    	}
        return output;
    }

    public String oddNumbers(){
    	String output = "oddNumbers()\n"
    					+"*** Output ***";
    	for(int x =1; x < 20 ; x+=2){
    		output += "\n"+x;
    	}
    		
        return output;
    }

    public String squares(){
        String output ="squareNumbers()\n"
    				   +"*** Output ***";
    	for(int x=1; x<=10; x++){
    		output += "\n" + (x*x);
    	}
        return output;
    }

    public String random4() {
        Random rn = new Random();
        String output = "random4()\n"
                +"*** Output ***";
        for (int i = 1; i <= 4; i++) {
            int nxt = rn.nextInt(10);
            output += "\n" + nxt;
        }
        return output;
    }

    public String even(int n){
        return "";
    }

    public String powers(int n){
        return "";
    }

}
