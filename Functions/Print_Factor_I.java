import java.util.Scanner;

public class Print_Factor_I {
    public static void PrintFactor(int N){
        for (int i = 1; i <= N; i++) {
            if (N%i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        PrintFactor(N);
        sc.close();
    }
}
