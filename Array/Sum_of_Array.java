import java.util.Scanner;

public class Sum_of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            a[i] = sc.nextInt();
        }

        long sum = 0;
        for (int i = 0; i <= n - 1; i++) {
            sum += a[i];
        }

        System.out.print(sum);
        sc.close();
    }
}
