
import java.util.Scanner;

public class Binary_Search_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        String x = sc.next();

        boolean flag = false;
        int l = 0;
        int r = n - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (names[mid].equals(x)) {
                flag = true;
                break;
            }
            if (names[mid].compareTo(x) < 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
