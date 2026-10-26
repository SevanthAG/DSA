
import java.util.Scanner;

public class Faster_runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minimum = arr[0];
        int location = 1;

        for (int i = 1; i < n; i++){
            if(arr[i] <= minimum){
                minimum = arr[i];
                location = i + 1;
            }
        }

        System.out.println(location);
        sc.close();
    }
}
