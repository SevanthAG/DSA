
import java.util.Scanner;

public class ToggleMe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                // convert TO lowercase
                ch += 32;
                sb.append(ch);
            } else {
                //Convert To upperCase
                ch -= 32;
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
