import java.util.Scanner;

public class Count_Good_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int count = 0;
        for (int i = 1; i <= N; i++) {
            long num = sc.nextInt();
            
            if (num != 0) {
                if (18 % num == 0 || num % 45 == 0) {
                    count++;
                }
            } else {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
