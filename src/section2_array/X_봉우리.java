package section2_array;

import java.util.Scanner;

public class X_봉우리 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 2][n + 2];

        for(int i=1;i<=n;i++) {
            for(int j=1; j<=n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        solve(arr, n);
    }

    public static void solve(int[][] array, int n) {
        int count = 0;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                int target = array[i][j];
                if(array[i-1][j] >= target) continue;
                if(array[i+1][j] >= target) continue;
                if(array[i][j+1] >= target) continue;
                if(array[i][j-1] >= target) continue;
                count++;
            }
        }
        System.out.print(count);
    }

}
