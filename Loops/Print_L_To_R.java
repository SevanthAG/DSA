import java.util.Scanner;

public class Print_L_To_R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();

        while (L <= R){
            System.out.print(L + " ");
            L++;
        }
        sc.close();
    }
}
