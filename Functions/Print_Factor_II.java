import java.util.Scanner;

public class Print_Factor_II {

    public static void factor2(int N){
        for (int i = N; i >= 1; i--) {
            if (N%i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        factor2(N);
        sc.close();
    }
}
