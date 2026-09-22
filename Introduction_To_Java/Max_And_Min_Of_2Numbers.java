import java.util.Scanner;

public class Max_And_Min_Of_2Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A  = sc.nextInt();
        int B  = sc.nextInt();

        if (A > B) {
            System.out.println("Min = "+ B);            
            System.out.println("Max = "+ A);            
        } else if (B > A) {
            System.out.println("Min = "+ A);            
            System.out.println("Max = "+ B);                
        } else {
            System.out.println("Min = "+ A);            
            System.out.println("Max = "+ A);                
        }
        sc.close();
    }
}
