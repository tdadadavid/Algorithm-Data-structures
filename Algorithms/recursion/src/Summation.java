public class Summation {
    public static void main(String[] args){
        System.out.println(iterativeSum(5));
        System.out.println(recursiveSum(5));
    }

    public static int iterativeSum(int number){
        if (number < 0)
            throw new IllegalStateException("Number must be greater than or equal to zero");

        int result = 0;

        for (int i = 1; i <= number; i++){
            result += i;
        }

        return result;
    }

    public static int recursiveSum(int number){
        if (number < 0)
            throw new IllegalStateException("Number must be greater than or equal to zero");

        if (number == 0) return number;
        return number + recursiveSum(number - 1);
    }
}