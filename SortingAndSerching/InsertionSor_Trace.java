
import java.util.Scanner;

public class InsertionSor_Trace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int shiftCount = 0;
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                shiftCount++;
                j--;
            }
            arr[j + 1] = temp;

            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < n; k++) {
                sb.append(arr[k]).append(" ");
            }

            StringBuilder sb1 = new StringBuilder();
            for (int k = 0; k <= i; k++) {
                sb1.append(arr[k]).append(" ");
            }

            StringBuilder sb2 = new StringBuilder();
            for (int k = i + 1; k < n; k++) {
                sb2.append(arr[k]).append(" ");
            }

            System.out.println("Pass " + i + ": " + sb + ", " + sb1 + "| " + sb2 + ", shifts = " + shiftCount);
        }
    }
}
