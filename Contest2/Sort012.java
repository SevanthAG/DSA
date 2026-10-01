import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int zeroCounter = 0;
        int oneCounter = 0;
        int twoCounter = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                zeroCounter++;
            } else if (a[i] == 1) {
                oneCounter++;
            } else {
                twoCounter++;
            }
        }
        for (int i = 0; i < twoCounter; i++) {
            System.out.print("2 ");
        }
        for (int i = 0; i < oneCounter; i++) {
            System.out.print("1 ");
        }
        for (int i = 0; i < zeroCounter; i++) {
            System.out.print("0 ");
        }
        sc.close();
    }   
}
