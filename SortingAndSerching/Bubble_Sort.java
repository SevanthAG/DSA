
import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = n-1; i > 0; i--) {
            int max = i;
            for (int j = 0; j < i; j++) {
                if(arr[j] > max) {
                    max = j;
                }
            }
        }
    }
}
