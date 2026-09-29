import java.util.Scanner;

public class Swap_alternative {

    public static void solve(Scanner sc) {
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i += 2) {
            int temp = a[i];
            a[i] = a[i-1];
            a[i-1] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            solve(sc);
        }
        sc.close();
    }
}
