import java.util.Scanner;

public class Count_Zeros {
    public static long zeroCounter(long N) {
        long count = 0;
        if (N == 0) {
            count = 1;
        }
        while (N!=0) {
            if (N%10 == 0) {
                count++;
            }
            N = N/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long count = zeroCounter(N);
        System.out.println(count);
        sc.close();
    }
}
