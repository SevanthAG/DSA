import java.util.Scanner;

public class Revered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int i = 0;
        int j = n - 1;
        while (i<=j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }

        for (int j2 = 0; j2 < n; j2++) {
            System.out.print(a[j2] + " ");
        }
        sc.close();
    }
}
