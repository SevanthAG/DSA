import java.util.Scanner;

public class pass_or_fail {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        int marks = sc.nextInt();

        if(marks >=35){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
