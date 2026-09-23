import java.util.Scanner;

public class Print_N_To_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int i = N;
        
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
        sc.close();
    }
}
