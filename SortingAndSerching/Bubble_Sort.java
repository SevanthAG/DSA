
import java.util.Scanner;

public class Bubble_Sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = n - 1; i > 0; i--) {
            int max = i;
            int swapCount = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                    swapCount++;
                }
            }

            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
            System.out.println(swapCount);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
        sc.close();
    }
}
