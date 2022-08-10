package solutions;

public class LC557_ReverseWordInAString3 {
    public static void main(String[] args){
        String s = "let's take a coding leetcode contest";
        String sentence = "God Ding";
        System.out.println(reverseWords(s));
    }



    private static String reverseWords(String s){
        String[] tokens = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for(String token : tokens) {
            for (int i = token.length() - 1; i >= 0; i--)
                sb.append(token.charAt(i));
            sb.append(" ");
        }

        String result = String.valueOf(sb);
        result = result.trim();

        return result;
    }

}
