import java.util.Scanner;

public class XpowerN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long X = sc.nextLong();
        long N = sc.nextLong();
        
        long ans = 1;
        int i = 1;

        while (i<=N) {
            ans = ans * X;
            i++;
        }
        System.out.println(ans);
        sc.close();
    }
}
