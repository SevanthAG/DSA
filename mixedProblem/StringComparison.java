
import java.util.Scanner;

public class StringComparison {

    public static void StringComparison(Scanner sc) {
        String s = sc.next();

        int n = s.length();
        int i = 0;
        while (i < n) {
            int j = i;
            int count = 0;

            while (j < n && s.charAt(i) == s.charAt(j)) {
                count++;
                j++;
            }
            System.out.print(s.charAt(i));
            if (count > 1) {
                System.out.print(count);
            }
            i = j;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            StringComparison(sc);
        }
    }
}
