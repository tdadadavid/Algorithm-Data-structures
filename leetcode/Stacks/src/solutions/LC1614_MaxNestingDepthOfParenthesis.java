package solutions;

public class LC1614_MaxNestingDepthOfParenthesis {
    public static void main(String[] args){
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }


    public static int maxDepth(String s) {
        int count = 0;
        int depthCount = 0;

        // first check if the string is an empty string or
        // an incomplete bracket and return 0 as the maxDepth
        if (s.equals("") || s.equals("(") || s.equals(")"))
            return 0;

        // iterate over the string
        for (char character : s.toCharArray()) {
            // and increase a count variable
            if (character == '(')
                count++;

                // when character is equal to ) decrement count
            else if (character == ')')
                count--;

            depthCount = Math.max(count , depthCount);
        }


        return depthCount;
    }
}
