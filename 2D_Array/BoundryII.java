
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BoundryII {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // top
        for (int j = 0; j <= m - 1; j++) {
            System.out.print(arr[0][j] + " ");
        }

        // left end
        for (int i = 1; i <= n - 1; i++) {
            System.out.print(arr[i][m - 1] + " ");
        }

        // left to right
        if (n > 1) {
            for (int j = m - 2; j >= 0; j--) {
                System.out.print(arr[n - 1][j] + " ");
            }
        }

        // Down to up
        if (m > 1) {
            for (int i = n - 2; i >= 1; i--) {
                System.out.print(arr[i][0] + " ");
            }
        }
    }
}
