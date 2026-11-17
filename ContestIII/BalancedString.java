
import java.util.Scanner;

public class BalancedString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int aCounter = 0;
        int bCounter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                aCounter++;
            } else {
                bCounter++;
            }
        }

        if (aCounter == bCounter) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
