import java.util.Scanner;

public  class Row_with_Max1s {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        int n = sc.nextInt();
        int m  = sc.nextInt();
        
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int bestRow = -1;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            int counter = 0;
            for (int j = 0; j < m; j++) {
                if(arr[i][j]== 1){
                    counter++;
                }
            }
            if(counter > maxCount){
                maxCount = counter;
                bestRow = i;
            }
        }

        System.out.println(bestRow);
        sc.close();
    }
}