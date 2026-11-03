
import java.util.Scanner;

public class InsertionSor_Trace {

    public static void main(String[] args) {
        Scanner sc = new Socanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int passCount = 1;

        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i -1;
            while( j > 0 && arr[j] > temp){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;

            System.out.println("Pass " + i + ": ");
            passCount++;
        }
    }
}
