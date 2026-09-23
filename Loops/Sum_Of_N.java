import java.util.Scanner;

public class Sum_Of_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N  = sc.nextLong();
        long i = 1;
        long sum = 0;
        while (i <= N) {
            sum =sum + i;
            i++; 
        }
        System.out.println(sum);
        sc.close();
    }
}
