
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;

    public class Row_minimum {

        public static void main(String[] args) throws IOException {
            StringBuilder sb = new  StringBuilder();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in)
            );

            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            for (int i = 0; i < n; i++) {
                int minimum = Integer.MAX_VALUE;
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    int box = Integer.parseInt(st.nextToken());
                    if (box < minimum) {
                        minimum = box;
                    }
                }
                sb.append(minimum).append(" ");
            }
            System.out.println(sb);
        }
    }
