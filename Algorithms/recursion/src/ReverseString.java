public class ReverseString {

    public static void main(String[] args) {
        String word = "backward";
        String testcase1 = "a";
        String testcase2 = "ab";
        String testcase3 = "";

        String result = reverseString(word);
        String result1 = reverseString(testcase1);
        String result2 = reverseString(testcase2);
        String result3 = reverseString(testcase3);

        System.out.println(word      + " => " + result);
        System.out.println(testcase1 + " => " + result1);
        System.out.println(testcase2 + " => " + result2);
        System.out.println(testcase3 + " => " + result3);
    }

    public static String reverseString(String input) {
        if (input.equals("")) return "";

        return reverseString(input.substring(1)) + input.charAt(0);
    }

}
