
import java.util.Scanner;

public class Remove_character {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char x = sc.next().charAt(0);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != x) {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
