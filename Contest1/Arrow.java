import java.util.Scanner;

public class Arrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for (int i = 1; i <= N; i++) {
            for (int j = i; j >= 2; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1 || j == i) {
                    if (j == 1) {
                        System.out.print(">");
                    } else {
                        System.out.print(" >");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = N-1; i >= 1; i--) {
            for (int j = i; j >= 2; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    if (j == 1) {
                        System.out.print(">");
                    } else {
                        System.out.print(" >");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
