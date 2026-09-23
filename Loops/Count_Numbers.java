import java.util.Scanner;

public class Count_Numbers {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        long Positive = 0;
        long Negative = 0;
        long Even = 0;
        long Odd = 0;

        long N = sc.nextLong();
        for (int i = 0; i < N; i++) {
            long inputN = sc.nextLong();

            if ( inputN < 0) {
                Negative++;
            }
            if (inputN > 0) {
                Positive++;
            }
            if (inputN % 2 == 0) {
                Even++;
            } else {
                Odd++;
            }
        }
        System.out.println(Positive);
        System.out.println(Negative);
        System.out.println(Even);
        System.out.println(Odd);
        sc.close();
    }
}
