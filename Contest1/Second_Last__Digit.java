import java.util.Scanner;

public class Second_Last__Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();
        
        int count = 1;
        while (N != 0) {
            if (count == 2) {
                System.out.println(N%10);
                return ;
            }
            N = N/10;
            count++;
        }
    }
}
