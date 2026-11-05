
import java.util.Scanner;

public class SelectionSortVsInsertionSort {

    public static int SelectionSort(int n, int[] arr) {
        int sCount = 0;
        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int pos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    pos = j;
                }
            }

            if (pos != i) {
                int temp = arr[i];
                arr[i] = min;
                arr[pos] = temp;
                sCount++;
            }
        }
        return sCount;
    }

    public static int insertionSort(int n, int[] arr) {
        int shiftCount = 0;

        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
                shiftCount++;
            }
            arr[j + 1] = temp;
        }
        return shiftCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            int n = sc.nextInt();

            int[] arr1 = new int[n];
            int[] arr2 = new int[n];

            for (int j = 0; j < n; j++) {
                int value = sc.nextInt();
                arr1[j] = value;
                arr2[j] = value;
            }

            int swapCounter = SelectionSort(n, arr1);
            int shiftCounter = insertionSort(n, arr2);

            if (swapCounter == shiftCounter) {
                System.out.println("Tie");
            } else if (swapCounter < shiftCounter) {
                System.out.println("Selection Sort");
            } else {
                System.out.println("Insertion Sort");
            }
        }
    }
}
