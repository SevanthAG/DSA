
import java.util.Scanner;

public class Binary_Search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Sorted Array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        boolean flag = false;
        int l = 0;
        int r = n - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid] == x) {
                flag = true;
                break;
            } else if (arr[mid] > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
