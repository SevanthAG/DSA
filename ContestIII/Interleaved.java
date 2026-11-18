
import java.util.Scanner;

public class Interleaved {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();

        int i = 0;
        int j = 0;

        StringBuilder sb = new StringBuilder();
        while (i < S.length() && j < T.length()) {
            if(sb.length() > 0) {
                sb.append("-");
            }
            sb.append(S.charAt(i));
            sb.append("-");
            sb.append(T.charAt(j));
            i++;
            j++;
        }

        while (i < S.length()) {
            sb.append("-").append(S.charAt(i));
            i++;
        }

        while (j < T.length()) {
            sb.append("-").append(T.charAt(j));
            j++;
        }

        System.out.println(sb);
    }
}
