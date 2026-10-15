
import java.util.Scanner;

public class Searcch_in_2d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == x) {
                    found = true;
                }
            }
        }

        if (found == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}
