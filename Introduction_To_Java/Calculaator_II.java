import java.util.Scanner;

public class Calculaator_II {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        long N = sc.nextLong();
        long M = sc.nextLong();

        System.out.printf("%d + %d = %d\n\n", N, M, N+M);
        System.out.printf("%d - %d = %d\n\n", N, M, N-M);
        System.out.printf("%d * %d = %d\n\n", N, M, N*M);
        System.out.printf("%d / %d = %d\n\n", N, M, N/M);
        System.out.printf("%d %% %d = %d", N, M, N%M);

        sc.close();
    }
}


// use next Long For large outputs..


