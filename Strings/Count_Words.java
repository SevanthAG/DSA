
import java.util.Scanner;

public class Count_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int count = 1;
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
