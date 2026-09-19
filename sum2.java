public class sum2{

    public static int recursiveSum(int n){
        if(n <= 0){
            return 0;
        } else {
            return n + recursiveSum(n - 1);
        }
    }

    public static void main(String[] args){
        int n = 5;
        int result = recursiveSum(n);
        System.out.println("The sum of numbers from 1 to " + n + " is: " + result);
    }
}