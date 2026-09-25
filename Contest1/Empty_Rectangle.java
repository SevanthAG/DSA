import java.util.Scanner;

public class Empty_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (i == 1 || i == N || j == 1 || j == M) {
                    System.out.print("^");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
