import java.util.Scanner;

public class Ascii_to_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int asciiValue = sc.nextInt();
        
        char ch = (char)asciiValue;

        System.out.println(ch);
        sc.close();
    }
}
