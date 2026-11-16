
import java.util.Scanner;

public class Intersection_to_arrays {

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    arr2[j] = -1;
                    break;
                }
            }
            if (found) {
                System.out.print(arr1[i] + " ");
            }
            found = false;
        }
        System.out.println("");

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
