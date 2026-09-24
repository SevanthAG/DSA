import java.util.Scanner;

public class Bynary_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int num;
            if (i % 2 == 0) {
                num = 0;
            } else {
                num = 1;
            }
            for (int j = 1; j <= i; j++) {
                // Alternative
                if (num == 0) {
                    num = 1;
                } else {
                    num = 0;
                }
                System.out.print(num);
            }
            System.out.println();
        }
        sc.close();
    }
}
