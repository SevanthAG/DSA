
import java.util.Scanner;

public class Almost_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if(i%j==0){
                    count++;
                }
            }

            if(count<=4){
                System.out.print(i+ " ");
            }
        }
        sc.close();
    }
}
