public class MutateDNAStings {
    public String mutateDNAPairs(String s){

        // if the string is empty return "" &
        // if it's a single char return the character
        if (s.length() <= 1)
            return s;

        StringBuilder sb = new StringBuilder();

        // iterate through the string array
        for (int i = 0; i < s.length()-1; i++){
            // check if the current character and
            // the next character are equal append
            // "T" in between then
            if (s.charAt(i) == s.charAt(i+1))
                sb.append(s.charAt(i)).append("G");
            else
                sb.append(s.charAt(i));

        }

        sb.append(s.charAt(s.length()-1));

        return String.valueOf(sb);
    }

    // use recursion to solve this problem
}
