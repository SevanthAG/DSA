import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long fact = 1;
        for (int i = 1; i <= N; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        sc.close();
    }
}
