import java.util.Scanner;

public class Find_the_location_point {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        if (X == 0 && Y == 0){
            System.out.println("Origin");
        } else if (Y == 0 && X != 0) {
            System.out.println("X axis");
        } else if (X == 0 && Y != 0) {
            System.out.println("Y axis");
        } else if (X > 0 && Y > 0) {
            System.out.println("1st Quadrant");
        } else if (X < 0 && Y > 0){
            System.out.println("2nd Quadrant");
        } else if (X < 0 && Y < 0) {
            System.out.println("3rd Quadrant");
        } else {
            System.out.println("4th Quadrant");
        }
        sc.close();
    }
}
