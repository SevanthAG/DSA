
import java.util.Scanner;

public class Special_factor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean flag = false;
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                if(i%10 == 2 || i%10 == 7){
                    System.out.print(i+" ");
                    flag = true;
                }
            }
        }
        if(flag == false){
            System.out.println("-1");
        }
        sc.close();
    }
}
