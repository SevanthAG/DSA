import java.util.Scanner;

public class Check_Prime {
    public static int checkPrime(int N){
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N%i == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int counter = checkPrime(N);
        if (counter == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
        sc.close();
    }
}
