package com.company;

public class ReplaceCSVDelimiter {
    public static void main(String[] args) {
        String string = "a,b,c";
        System.out.println(replaceCSVDelimiter(string , "_"));

    }

   /* public static String replaceCSVDelimiter(String word , String delimiter){
        String newString = "";

        for (char letter : word.toCharArray()) {
            if (letter == ',')
                newString += delimiter;
            else
                newString += letter;

        }

        return newString;
    }


    */

    public static String replaceCSVDelimiter(String csv , String replacement){
        StringBuilder sb = new StringBuilder();


        for (char letter : csv.toCharArray()) {
            if (letter == ',')
                sb.append(replacement);
            else
                sb.append(letter);

        }

        return  sb.toString();
    }
}
