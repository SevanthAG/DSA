
import java.util.Scanner;

public class SelectionSortTrace {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            int min = i;
            int minimum = min;
            for (int j = i + 1; j < N; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < N; j++) {
                sb.append(arr[j]).append(" ");
            }
            System.out.println("Pass " + (i + 1) + ": " + sb + ", min_selected = " + arr[minimum]);
        }
    }
}
