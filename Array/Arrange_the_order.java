import java.util.Scanner;

public class Arrange_the_order {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();

        int[] even = new int[n];
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (i%2 != 0) {
                System.out.print(i + " ");
            } else {
                even[j] = i;
                j++;
            }
        }

        for (int i = j-1; i >= 0; i--) {
            System.out.print(even[i] + " ");
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
