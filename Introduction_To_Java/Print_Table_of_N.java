import java.util.Scanner;

public class Print_Table_of_N {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        int number = sc.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%d * %d = %d\n",number, i, number * i);
        }
        sc.close();
    }
}
