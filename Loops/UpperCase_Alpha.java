import java.util.Scanner;

public class UpperCase_Alpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char i = 'A';
        while (i <= 'Z') {
            System.out.print(i+" ");
            i++;
        }
        sc.close();
    }
}
