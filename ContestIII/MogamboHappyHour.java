
import java.util.Scanner;

public class MogamboHappyHour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Time = sc.nextLine();

        String[] parts = Time.split(":");

        if (parts[0].equals(parts[1])) {
            System.out.println("Mogambo is happy");
        } else {
            System.out.println("Mogambo is sad");
        }
        sc.close();
    }
}
