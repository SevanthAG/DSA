
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SpiralMatrix {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int j = 0; j < m; j++) {
            System.out.print(a[0][j] + " ");
        }

        for (int i = 1; i < n; i++) {
            System.out.print(a[i][m - 1] + " ");
        }

        for (int j = m - 2; j >= 0; j--) {
            System.out.print(a[n - 1][j] + " ");
        }

        for (int i = n - 2; i >= 1; i--) {
            System.out.println(a[i][0]);
        }

    }
}
