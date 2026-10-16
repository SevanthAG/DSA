
import java.util.Scanner;

public class Count_Quadraplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int x = sc.nextInt(); 
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int counter = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    for (int l = k + 1; l < N; l++) {
                        if (arr[i] - 2 * arr[j] + 3 * arr[k] - 4 * arr[l] == x) {
                            counter++;
                        }
                    }
                }
            }
        }
        System.out.println(counter);
        sc.close();
    }
}
