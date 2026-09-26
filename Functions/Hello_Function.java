import java.util.Scanner;

public class Hello_Function {


    public static void PrintHello(int N) {
        for (int i = 1; i <= N; i++) {
            System.out.println("I am learning functions");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        int N = sc.nextInt();

        PrintHello(N);
        sc.close();
    }
}
