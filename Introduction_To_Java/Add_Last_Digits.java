import java.util.Scanner;

public class Add_Last_Digits {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int Last_Digit_N = N%10;
        int Last_Digit_M = M%10;

        System.out.printf("%d", Last_Digit_N + Last_Digit_M);

        sc.close();
    }
}
