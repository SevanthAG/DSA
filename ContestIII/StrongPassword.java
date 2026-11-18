
import java.util.Scanner;

public class StrongPassword {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int size = s.length();

        int lowerCount = 0;
        int upperCount = 0;
        int digitCount = 0;
        int specialCount = 0;

        int satisfied = 0;

        for (int i = 0; i < size; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                lowerCount++;
            } else if (ch >= 'A' && ch <= 'Z') {
                upperCount++;
            } else if (ch >= '0' && ch <= '9') {
                digitCount++;
            } else {
                specialCount++;
            }
        }

        if (lowerCount > 0) {
            satisfied++;
        }
        if (upperCount > 0) {
            satisfied++;
        }
        if (specialCount > 0) {
            satisfied++;

        }
        if (digitCount > 0) {
            satisfied++;
        }

        if (satisfied == 4) {
            System.out.println("Strong");
        } else if (satisfied == 3) {
            System.out.println("Moderate");
        } else {
            System.out.println("Weak");
        }
    }
}
