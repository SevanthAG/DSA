
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

        int startRow = 0;
        int startCol = 0;

        int endRow = n;
        int endCol = m;

        while (startRow < endRow && startCol < endCol) {
            for (int j = startCol; j < endCol; j++) {
                System.out.print(a[startRow][j] + " ");
            }

            for (int i = startRow + 1; i < endRow; i++) {
                System.out.print(a[i][endCol - 1] + " ");
            }

            if (startRow < endRow - 1) {
                for (int j = endCol - 2; j >= startCol; j--) {
                    System.out.print(a[endRow - 1][j] + " ");
                }
            }

            if (startCol < endCol - 1) {
                for (int i = endRow - 2; i >= startRow + 1; i--) {
                    System.out.print(a[i][startCol] + " ");
                }
            }
            startRow++;
            startCol++;

            endRow--;
            endCol--;

        }
    }
}