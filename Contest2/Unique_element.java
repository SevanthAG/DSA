
import java.util.Scanner;

public class Unique_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int count  = 0;
            for (int j = 0; j < N; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(arr[i]+ " ");
            }
        }
        System.out.println("");
        sc.close();
    }
}
