import java.util.Scanner;

public class minElement_with_ItPos {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int pos = 1;
        int min = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
                pos = i + 1;
            }
        }
        System.out.print(min+ " "+  pos);
        sc.close();
    }
}
