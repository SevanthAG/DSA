
import java.util.Scanner;

public class Pair_sum {

    public static void  solve(Scanner sc){
        int N = sc.nextInt();

        int[] arr = new  int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();


        int counter = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if(arr[i] + arr[j] == x){
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            solve(sc);
        }
    }
}
