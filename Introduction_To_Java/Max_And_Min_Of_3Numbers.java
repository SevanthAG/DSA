import java.util.Scanner;

public class Max_And_Min_Of_3Numbers {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A>=B && A>=C) {
            if (B>=C) {
                System.out.println("Min = "+C);                
                System.out.println("Max = "+A);                
            } else {
                System.out.println("Min = "+B);                
                System.out.println("Max = "+A);                
            } 
        }
        else if (B>=A && B>=C) {
            if (A>=C) {
                System.out.println("Min = "+C);                
                System.out.println("Max = "+B);                
            } else {
                System.out.println("Min = "+A);                
                System.out.println("Max = "+B);                
            } 
        }
        else {
            if (A>=B) {
                System.out.println("Min = "+B);                
                System.out.println("Max = "+C);                
            } else {
                System.out.println("Min = "+A);                
                System.out.println("Max = "+C);                
            } 
        }
    sc.close();
    }
}
