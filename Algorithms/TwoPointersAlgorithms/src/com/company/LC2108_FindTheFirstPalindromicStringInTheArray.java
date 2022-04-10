package com.company;

public class LC2108_FindTheFirstPalindromicStringInTheArray {
    public static void main(String[] args){

        String[] testcase1 = {"abc","car","ada","racecar","cool"};
        String[] testcase2 = {"notapalindrome","racecar"};
        String[] testcase3 = {"def","ghi"};
        String[] testcase4 = {"xngla","e","itrn","y","s","pfp","rfd"};
        String[] testcase5 = {"cqllrtyhw","swwisru","gpzmbders","wqibjuqvs","pp","usewxryy","ybqfuh","hqwwqftgyu","jggmatpk"};
        String[] testcase6 = {
                              "knywrurkwbrtpalvuuzbczcwzpdqibcwwyflwiddixemsrwblupyerjgvcpavdjfhmujitcsmdbvhxw",
                              "ovkeowhqvwlndtpxdnimgietvjsqydbuuwmxkfxxgn","damomwtjugmsrfyvytaheg","bngqatscosdakdwjz",
                              "jwzcowuantgqlzjrzgpapcugxvviltrhmcwijtpqapmxjfcilrsmsbeffphcxmaozlczncoxxjmuqijhidxqinhywrtah",
                              "ujvoejixvaioikkwzxgtmkchckrigfejjpheiiehpjjefgirkchckmtgxzwkkioiavxijeovju",
                              "kacjvcouuigbhydrryaperxvjetwsycmnlkxujaqngjhhotqskclquklxsozfryfxwiksstmropcdvhgsnosgvltqo",
                              "qrbsdxxolwzmyltproznfgyydxkkejwdiwpvfzvjoxqvwguoerhclytzvolymbxummwsoqtttyttik",
                              "tkekt","esrshrlfoihhjrouleucwpeubygivoatrfraphgwpvtkanwu",
                              "kwzrfelynncvsrwvaukiinhjdydmlimggjldhflygemzwnjizzlsuqwahsufwmwhfjkjpngdfsudyavtogoaqzknpew",
                              "sdgpcnvsbzxhyjt"
                            };

        System.out.println(firstPalindrome(testcase1));
        System.out.println(firstPalindrome(testcase2));
        System.out.println(firstPalindrome(testcase3));
        System.out.println(firstPalindrome(testcase4)); // Take note of one character string
        System.out.println(firstPalindrome(testcase5)); // Take note of two character string
        System.out.println(firstPalindrome(testcase6));

    }

    // Timce complexity = O(n)
    // Space complecity = O(n)
    // the space of the stringBuilder grows with the input size
    private static String firstPalindrome(String[] words){

        StringBuilder builder = new StringBuilder();

        // iterate over all strings in the array
        for (String word : words){

            // append each word
            builder.append(word);

            // reverse the appended word
            builder.reverse();

            // if the reversed and original word is same return the word
            if (word.equals(builder.toString())) return word;

            // else delete the word from the string builder
            builder.delete(0,  word.length());
        }

        return "";
    }
}
