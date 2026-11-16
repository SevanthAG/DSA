
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RotateArray {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());
        int test = Integer.parseInt(st.nextToken());

        for (int i = 0; i < test; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            int[] a = new int[n];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < a.length; j++) {
                a[j] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());

            int[] copyArray = new int[d];
            for (int j = 0; j < d; j++) {
                copyArray[j] = a[j];
            }

            int index = 0;
            for (int j = d; j < a.length; j++) {
                a[index] = a[j];
                index++;
            }

            while (index < n) {
                for (int j = 0; j < d; j++) {
                    a[index] = copyArray[j];
                    index++;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < a.length; j++) {
                sb.append(a[j]).append(" ");
            }
            System.out.println(sb);

        }
    }
}
