
public class sum1{
    public static void main(String[] args)
    {
        int N = 10;
        int sum = 0;
        System.out.println("The first " + N + " natural numbers are: ");
        for(int i = 1; i <= N; ++i)
        {
            sum += i;
        }
    System.out.println("The sum of the first " + N + " natural numbers is: " + sum);
    }
}