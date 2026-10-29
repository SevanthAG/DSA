
import java.util.Scanner;

public class linerSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            if(arr[i] == x){
                flag = true;
            }
        }

        if(flag){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}