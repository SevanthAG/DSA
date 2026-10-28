
import java.util.Scanner;

public class Replace_character{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);

        // // 1 way
        // char[] arr = s.toCharArray();

        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i] == c1){
        //         arr[i] = c2;
        //     }            
        // }

        // System.out.println(new String(arr));

        //using replace
        // System.out.println(s.replace(c1, c2));

        //Using StringBuilder
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == c1){
                sb.setCharAt(i, c2);
            }            
        }

        System.out.print(sb);
        sc.close();
    }
}