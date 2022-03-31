package com.company;

import java.util.Locale;

public class LC2129_CapitalizeTheTitle {
    public static void main(String[] args) {
        String testCase1 = "capitAlize tHe titLE to small letter";
        System.out.println(capitalizeTitle(testCase1));
    }

    // time complexity O(
    private static String capitalizeTitle(String s){

        StringBuilder builder = new StringBuilder();
        String[] tokens = s.split(" ");

        for (String token : tokens) {
            if (token.length() <= 2)
                builder.append(token.toLowerCase()).append(" ");
            else
                builder.append(token.substring(0, 1).toUpperCase()).append(token.substring(1).toLowerCase()).append(" ");
        }

        return String.valueOf(builder).trim();
    }
}
