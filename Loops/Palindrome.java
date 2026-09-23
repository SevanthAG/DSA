import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         long N = sc.nextLong();

         long original = N;
         long reversed = 0;

         while(N !=0) {
            reversed = (reversed * 10) + (N%10);
            N = N / 10;
         }
         if (original == reversed) {
            System.out.println("YES");
         } else {
            System.out.println("NO");
         }
         sc.close();
    }
}
