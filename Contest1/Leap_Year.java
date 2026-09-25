import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        sc.close();

        if(Y%100 == 0) {
            if (Y%400 == 0) {
                System.out.println("Yes");
                return ;
            } else  {
                System.out.println("No");
                return ;
            }
        }
        if (Y%4 == 0) {
            System.out.println("Yes");
            return ;
        } else {
            System.out.println("No");
            return ;
        }
    }
}
