
import java.util.Scanner;

public class Brothers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String p1firstName = sc.next();
        String p1lastName = sc.next();

        String p2firstName = sc.next();
        String p2lastName = sc.next();

        if (p1lastName.equals(p2lastName)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
