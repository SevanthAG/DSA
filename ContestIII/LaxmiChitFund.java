
import java.util.Scanner;

public class LaxmiChitFund {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] a = new int[N];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int Total = 0;
        int Avg = 0;

        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
            Total += a[i];
            Avg = Total / N;
        }

        System.out.println(Total + " " + max + " " + min + " " + Avg);
    }
}
