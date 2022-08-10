package solutions;

public class First_unique_character_in_a_string_387 {

    public static void main(String[] args) {

        String letters = "aabb";
        String testcase2 = "aaaaabbabababcqiqowowodjdok";

        System.out.println(uniqueChar(letters));
        System.out.println(uniqueChar(testcase2));

    }


    public static int uniqueChar(String letters) {

        for (int i = 0; i <= letters.length() - 1; i++)
            if (letters.indexOf(letters.charAt(i)) == letters.lastIndexOf(letters.charAt(i)))
                return i;

        return -1;
    }
}


