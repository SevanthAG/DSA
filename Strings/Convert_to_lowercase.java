import java.util.Scanner;

public class Convert_to_lowercase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            ch += 32;
        } 

        System.out.println(ch);
        sc.close();
    }
}

