import java.util.Scanner;

public class nCr {
    public static int fact(int N){
        int fact = 1;
        for (int i = 1; i <= N; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        sc.close();

        int nCr = fact(n) / (fact(r) * fact(n -r));
        System.out.println(nCr);
    }
}
