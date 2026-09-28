import java.util.Scanner;

public class maxEle_with_position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long pos = 1;
        long max = 0;

        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                pos = i + 1;
            }
        }
        System.out.print(max + " " + pos);
        sc.close();
    }
}
