import java.util.Scanner;

public class Rev_And_Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        long reversed = 0;
        while (N != 0) {
            reversed = (reversed * 10) + (N % 10);
            N = N / 10;  
        }
        System.out.println(reversed);
        sc.close();
    }
}
