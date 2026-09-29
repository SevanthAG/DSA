import java.util.Scanner;

public class Arrange_the_order {
    public static void solve(Scanner sc){
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }

        for (int i = 1; i < n; i++) {
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            solve(sc);
        }
        sc.close();
    }
}
