public class Factorial {
    public static void main(String[] args){
        int number = 10;
        int result = tailRecursionFactorial(number, 1);
        System.out.println(result);
    }



    public static int recursiveFactorial(int n){
        if (n < 0)
            throw new IllegalStateException("Number must be greater than or equal to 0");
        else if (n == 0) return 1;
        else return n * recursiveFactorial(n - 1);
    }

    /**
     * This uses the tail recursion approach which save time
     * and memory
     *
     * link to understand the flow (https://www.youtube.com/watch?v=_JtPhF8MshA)
     *
     * @return accumulator
     */
    public static int tailRecursionFactorial(int n, int accumulator){
        if (n < 0)
            throw new  IllegalStateException("Number must be greater than or equal to zero");

        if (n == 0) return accumulator;
        else return tailRecursionFactorial(n-1, accumulator * n);
    }



    public static int loopFactorial(int n){
        if (n < 0)
            throw new IllegalStateException("Number must be greater than or equal to 0");

        // The complementary operation for multiplication
        // is 1 as the complementary operation for addition is 0

        int result = 1;

        // Here we are using a Bottom down approach
        // we have our base to be the loop-condition
        // " i >= 1" this affords us to break when
        // reach n = 0... because (0)! = 1

        for (int i = n; i >= 1; i--){
            result *= i;
        }

        return result;
    }
}
