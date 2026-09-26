import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print(".");
                } else {
                    System.out.print(" .");
                }
            }
            System.out.println();
        }
        for (int i = 2; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print(".");
                } else {
                    System.out.print(" .");
                }
            }
            System.out.println();
        }
    }
}
