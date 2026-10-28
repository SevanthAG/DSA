
import java.util.Scanner;

public class Strong_password {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int countChar = 0;
        int countLower = 0;
        int countUpper = 0;
        int countDigit = 0;
        int countSpecial = 0;

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z') {
                countUpper++;
            } else if (sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z') {
                countLower++;
            } else if (sb.charAt(i) >= '0' && sb.charAt(i) <= '9') {
                countDigit++;
            } else {
                countSpecial++;
            }
            countChar++;
        }

        if (countChar == 10 && countLower >= 1 && countUpper >= 1 && countDigit >= 1 && countSpecial >= 1) {
            System.out.println("Strong");
        } else {
            System.out.println("Weak");
        }
    }
}
