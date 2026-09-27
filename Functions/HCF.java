import java.util.Scanner;

public class HCF {

    public static int Factor(int A, int B) {
        int result = 1;
            for (int i = 1; i <= A && i <= B; i++) {
                if (A % i == 0 && B % i == 0) {
                    result = i;
                }
            }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int res = Factor(A, B);
        System.out.println(res);
        sc.close();
    }
}
