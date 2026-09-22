import java.util.Scanner;

public class Multiple {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        if (N * N == M) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}