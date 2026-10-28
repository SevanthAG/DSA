
import java.util.Scanner;

public class Toggle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z') {
                char c = sb.charAt(i);
                c += 32;
                sb.setCharAt(i, c);
            } else {
                char c = sb.charAt(i);
                c -= 32;
                sb.setCharAt(i, c);
            }
        }
        System.out.println(sb);
    }
}
