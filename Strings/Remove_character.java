
import java.util.Scanner;

public class Remove_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char x = sc.next().charAt(0);

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == x){
                sb.deleteCharAt(i);
            }
        }
        System.out.println(sb);
    }
}
