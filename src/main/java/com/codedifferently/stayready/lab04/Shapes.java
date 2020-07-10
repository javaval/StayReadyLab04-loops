package com.codedifferently.stayready.lab04;


public class Shapes {

    public static String triangle() {
        //init empty output string
       String empty = "triangle()\n"
                     +"*** Output ***";
        for( int i = 1; i <= 5; i++){
            empty += getRow(i) + "\n";
        }
        //return output string
        return empty;
    }
    
    //getRow(20) -> "********************"
    public static String getRow(int numberOfStars) {
        //init empty 
        String empty = "";
        
        for(int i = 1; i <= numberOfStars; i++){
            empty += "*";
        }
        return empty;
    }

    public static String buildTableRow(int multiple, int length){
        String rowBuild = "";
        for(int x = 1; x <= length; x++){
            int number = x * multiple;
            rowBuild += String.format("%3d |", number);
        }
        return rowBuild;
    } 
    

    public String tableSquare(){
        String getSmall = "triangle()\n"
                        + "*** Output ***";
        for( int i = 1; i <= 5 ; i++){
            int length = 5;
            getSmall += buildTableRow(i,length)+ "\n";

        }
        return getSmall;
    }


    public String tableSquares(int n){
        String getLarge = "tableSquares(6)\n"
                         + "*** Output ***";
        for( int i = 1; i <= 6; i++){
            int length = 6;
            getLarge += buildTableRow(i,length)+ "\n";
        }
        
        return getLarge;
    }
}
