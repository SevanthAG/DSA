
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        String reveredString = sb.toString();

        if(s.equals(reveredString)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
