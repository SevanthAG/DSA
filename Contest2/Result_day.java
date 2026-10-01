import java.util.Scanner;

public class Result_day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int passMark = sc.nextInt();
        int passCount = 0;
        int failCount = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] >= passMark) {
                passCount++;
            } else {
                failCount++;
            }
        }

        System.out.println("Pass: " + passCount);
        System.out.println("Fail: " + failCount);

        sc.close();
    }
}