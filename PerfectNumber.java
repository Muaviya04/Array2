import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        long n , sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        n= sc.nextLong();
        int i = 1;
        // Executes till the condition comes false
        while(i<=n/2)
        {
        if (n % i ==0)
        {
            // calculates sum of factors
            sum = sum + i;
        }
        // Increment of i by 1
        i++;
        }
        if (sum == n){
            System.out.println(n + " is a perfect number");
        }
        else {
            System.out.println(n + " is not a perfect number");
        }
    }
}
