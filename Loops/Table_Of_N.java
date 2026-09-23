import java.util.Scanner;

public class Table_Of_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int i = 1;
        while (i<=10) {
            System.out.printf("%d * %d = %d\n", N, i, N*i);
            i++;
        }
        sc.close();
    }
}
