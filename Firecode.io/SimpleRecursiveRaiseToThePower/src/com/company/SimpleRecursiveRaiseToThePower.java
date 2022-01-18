package com.company;

public class SimpleRecursiveRaiseToThePower {
    public static void main(String[] args) {
        long ans = simplePow(2 , 1);
        System.out.println(ans);
    }

    public static long simplePow(int base , int exponent){
        // there must be a condition for breaking the recursion
        // which should be that when the exponent is = 0

        if (exponent == 0)
            return 1;

        return base * simplePow(base , exponent-1);
    }
}
