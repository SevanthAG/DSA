import java.util.Scanner;

public class Print_Number_in_Rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        while (N != 0) {
            System.out.print(N%10);
            N = N/10;
        }
        sc.close();
    }
}
