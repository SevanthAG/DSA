
import java.util.Scanner;

public class Longest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = s.length();
        int i = 0;

        int ans = 0;
        while (i < n) {
            int j = i;
            int count = 0;

            if (s.charAt(j) == ' ') {
                i++;
                continue;
            }

            while (j < n && s.charAt(j) != ' ') {
                count++;
                j++;
            }
            i = j;

            if (ans < count) {
                ans = count;
            }
        }
        System.out.println(ans);
    }
}
