
import java.util.Scanner;

public class SumOfDigit2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int n = s.length();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + s.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
