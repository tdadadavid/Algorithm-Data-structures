package solutions;

public class LC15_BuddyStrings {
    public static void main(String[] args){
        String s = "abfs";
        String goal = "sfba";

        boolean ans = buddyStrings(s, goal);
        System.out.println(ans);

    }

    public static boolean buddyStrings(String s, String goal) {
        // convert string to array
        // then switch any element with its previous or next element
        // if its equal to the goal then return true else false

        char[] sArr = s.toCharArray();

        for (int i = 0; i < sArr.length-1; i++){
            char temp = sArr[i];
            sArr[i] = sArr[i + 1];
            sArr[i+1] = temp;
        }


        if (goal.charAt(0) == sArr[0])
            return true;

        return false;
    }
}
