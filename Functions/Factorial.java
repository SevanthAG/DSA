import java.util.Scanner;

public class Factorial {
    public static long factorial(long N){
        long fact = 1;
        for (int i = 1; i <= N; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long ans = factorial(N);
        System.out.println(ans);
        sc.close();
    }
}
