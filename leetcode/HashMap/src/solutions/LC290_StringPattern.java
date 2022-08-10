package solutions;

import java.util.HashMap;

public class LC290_StringPattern {
    public static void main(String[] args){
        String word = "abbc";
        String sentence = "dog dog dog dog";
        System.out.println(isThereAPattern(word, sentence));

    }

    private static boolean isThereAPattern(String word, String sentence){

        // convert word and sentence to array
        char[] wordArr = word.toCharArray();
        String[] sentenceArr = sentence.split(" ");

        if (wordArr.length != sentenceArr.length)
            return false;

        HashMap<Character , String> hashPattern = new HashMap<>();

        for (int i = 0; i < wordArr.length; i++){
            char key = wordArr[i];
            String sentenceEquivalent = sentenceArr[i];

            if (hashPattern.containsKey(key)) {

                String value = hashPattern.get(key);

                if (!sentenceEquivalent.equalsIgnoreCase(value))
                    return false;

            }
            else {
                if(hashPattern.containsValue(sentenceEquivalent))
                    return false;
                hashPattern.put(wordArr[i], sentenceArr[i]);
            }
        }

        return true;
    }
}
