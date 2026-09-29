import java.util.Scanner;

public class Sort01 {

    
    public static void solve(int n, Scanner sc) {

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int zeroCounter = 0;
        int oneCounter = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                zeroCounter++;
            }
            if (a[i] == 1) {
                oneCounter++;
            }
        }
        for (int i = 0; i < zeroCounter; i++) {
            System.out.print("0 ");
        }
        for (int i = 0; i < oneCounter; i++) {
            System.out.print("1 ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt(); //2

        for (int i = 0; i < test; i++) {
            int n = sc.nextInt();
            solve(n, sc);
        }
        sc.close();
    }
}
