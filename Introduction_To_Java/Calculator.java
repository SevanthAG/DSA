import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.printf("%d + %d = %d\n", N, M, N+M);
        System.out.printf("%d - %d = %d\n", N, M, N-M);
        System.out.printf("%d * %d = %d\n", N, M, N*M);
        System.out.printf("%d / %d = %d\n", N, M, N/M);
        System.out.printf("%d %% %d = %d", N, M, N%M);

        sc.close();
    }
}
