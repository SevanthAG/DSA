import java.util.Scanner;

public class Print_Array_in_Reveres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i <= N - 1; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = N-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}