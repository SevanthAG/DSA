
import java.util.Scanner;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int[] arr3 = new int[n + m];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int j = 0; j < m; j++) {
            arr2[j] = sc.nextInt();
        }

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while (j < m) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i1 = 0; i1 < (n + m); i1++) {
            sb.append(arr3[i1]).append(" ");
        }
        System.out.println(sb);
    }
}
