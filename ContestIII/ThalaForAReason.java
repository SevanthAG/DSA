
import java.util.Scanner;

public class ThalaForAReason {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int R = sc.nextInt();
            int sum = 0;
            while (R != 0) {
                sum += R % 10;
                R = R / 10;
            }
            if (sum == 7) {
                System.out.println("Thala for a reason");
            } else {
                System.out.println("Blocked for no reason");
            }

        }
    }
}
