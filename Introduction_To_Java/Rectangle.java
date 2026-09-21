import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        int length = sc.nextInt();
        int breadth = sc.nextInt();

        int Area = length * breadth;
        int Perimeter = 2 * (length + breadth);
        
        System.out.println("Area = "+ Area);
        System.out.println("Perimeter = "+ Perimeter);

        sc.close();
    }
}
