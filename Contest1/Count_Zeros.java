import java.util.Scanner;

public class Count_Zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();

        int count = 0;

        if (N == 0) {
            count = 1;
        }

        while (N != 0) {
            if (N%10 == 0) {
                count++;
            }
            N = N/10;
        }
        System.out.print(count);
    }
}
