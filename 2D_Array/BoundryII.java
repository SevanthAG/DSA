
import java.util.Scanner;

public class BoundryII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
// top
        for (int j = 0; j <= m-1; j++) {
            System.out.print(arr[0][j] + " ");
        }

        // left end
        for (int i = 1; i <= n-1; i++) {
            System.out.print(arr[i][m - 1] + " ");
        }

        // left to right
        if(n > 1){
            for (int j = m - 2; j >= 0; j--) {
                System.out.print(arr[n - 1][j] + " ");
            }
        }

        // Down to up
        if(m > 1) {
            for (int i = n - 2; i >= 1; i--) {
                System.out.print(arr[i][0] + " ");
            }
            }

        sc.close();
    }
}
