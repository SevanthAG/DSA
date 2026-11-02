
import java.util.Scanner;

public class Bubble_Sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int passCount = 1;
        for (int i = n - 1; i > 0; i--) {
            int swapCount = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(arr[j]).append(" ");
            }
            System.out.println("Pass " + passCount + ": " + sb + " " + ", swaps = " + swapCount);
            passCount++;
            if (swapCount == 0) {
                break;
            }
        }
        sc.close();
    }
}
