public class RaiseToPowerN {
    public static void main(String[] args){
        System.out.println(recursiveRaiseToPower(2, 2));
        System.out.println(recursiveRaiseToPower(2, 3));
        System.out.println(recursiveRaiseToPower(10, 3));
        System.out.println(recursiveRaiseToPower(12, 0));

        System.out.println(iterativeRaiseToPower(12, 0));
        System.out.println(iterativeRaiseToPower(10, 3));
        System.out.println(recursiveRaiseToPower(2, 2));
    }


    /**
     * From Mathematics (any value)^exponent =  (the value) * (value)^(exponent - 1)
     * and from mathematics (any value)^0 = 1 (the simplest problem when it comes to exponent)
     *
     * So the exponent will continually decrease based on the mathematical expression till
     * we get to a base case (the simplest problem) which is when (any value)^0
     * this means the base case is when the exponent is = 0
     *
     * This method of recursion only works for positive exponents ie
     * exponents >= 0
     *
     * @returns value
     */
    public static int recursiveRaiseToPower(int value, int exponent){
        if (exponent == 0) return 1;  // Base condition
        else return (value * recursiveRaiseToPower(value, exponent - 1)); // general case
    }

    public static int iterativeRaiseToPower(int value, int exponent){

        if (exponent == 0) return 1;

        int exponentialResult = 1;

        while(exponent > 0){
            exponentialResult *= value;

            exponent--;
        }

        return exponentialResult;
    }
}
