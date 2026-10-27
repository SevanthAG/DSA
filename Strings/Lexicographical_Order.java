
import java.util.Scanner;

public class Lexicographical_Order {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        if (A.equals(B)) {
            System.out.print("Equal");
        } 
        if (A.compareTo(B) < 0) {
            System.out.println("A");
        } 
        if( A.compareTo(B) > 0) {  
            System.out.println("B");
        }
    }
}
