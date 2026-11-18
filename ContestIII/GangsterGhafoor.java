
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GangsterGhafoor {

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

        StringBuilder sb = new StringBuilder();
        boolean found = false;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i][0] == -1) {
                found = true;
                break;
            }
            sb.append(a[i][0]).append(" ");
        }

        if(!found){
            for (int j = 1; j < m; j++) {
                if (a[0][j] == -1) {
                    found = true;
                    break;
                }
                sb.append(a[0][j]).append(" ");
            }
        }

        if(!found){
            for (int i = 1; i <= n - 1; i++) {
                if (a[i][m - 1] == -1) {
                    found = true;
                    break;
                }
                sb.append(a[i][m - 1]).append(" ");
            }
        }

        if (!found) {
            for (int j = m - 2; j >= 1; j--) {
                if (a[n - 1][j] == -1) {
                    break;
                }
                sb.append(a[n - 1][j]).append(" ");
            }
        }
        System.out.println(sb);
    }
}
