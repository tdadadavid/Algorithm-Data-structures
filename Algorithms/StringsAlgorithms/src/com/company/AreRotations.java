package com.company;

public class AreRotations {
    public static void main(String[] args){
        boolean ans = areRotations(null , null);
        System.out.println(ans); //BoyBoy
    }

    public static boolean areRotations(String firstString , String secondString){

        return ( firstString != null && secondString != null &&
                firstString.length() ==  secondString.length()
                && (firstString + firstString).contains(secondString)
        );
    }

}
