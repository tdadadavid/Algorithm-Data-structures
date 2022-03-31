package com.company;

public class BetterPow {
    public static void main(String[] args){
        System.out.println(betterPow(2,3));
        System.out.println(betterPow(3,-1));
        System.out.println(betterPow(-3,3));
        System.out.println(betterPow(0, 1));
        System.out.println(betterPow(3,0));
        System.out.println(betterPow(5, 0));
        System.out.println(betterPow(2,-2));
    }

    private static double betterPow(double base, int exponent){

        if (exponent == 0)
            return 1.0;

        if(exponent < 0)
            return betterPow((1/base), -exponent);

        if(exponent % 2 == 1)
            return base * (betterPow(base, exponent-1));

        return betterPow((base * base), exponent / 2);
    }
}
