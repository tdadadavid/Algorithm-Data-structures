
public class LC1221_SplitAStringInBalancedStrings {
    public int balancedStringSplit(String s){

        // for each iteration check for L or R
        // increment pointer for each of them
        // when they're equal increment count
        // set back the pointers to 0

        int LPointer = 0, RPointer = 0 , count = 0;

        for (int i = 0; i < s.length(); i++){

            if (s.charAt(i) == 'L') LPointer++;
            if (s.charAt(i) == 'R') RPointer++;

            if (LPointer == RPointer) {
                count++;
                LPointer = 0;  RPointer = 0;
            }
        }

        return count;
    }
}
