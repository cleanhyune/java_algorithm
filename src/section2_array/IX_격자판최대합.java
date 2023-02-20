package section2_array;

import java.util.Scanner;

public class IX_격자판최대합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0;i<n;i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        solve(arr, n);
    }

    public static void solve(int[][] array, int n) {
        int max = 0;

        int leftSide = 0;
        int rightSide = 0;

        for(int i=0;i<n;i++) {
            int rowSum = 0;
            int colSum = 0;
            for(int j=0; j<n; j++) {
                rowSum += array[i][j];
                colSum += array[j][i];
                if(i == j) leftSide += array[i][j];
                if(i + j == n - 1) rightSide += array[i][j];
            }
            max = Math.max(max, Math.max(rowSum, colSum));
        }
        max = Math.max(max, Math.max(leftSide, rightSide));
        System.out.println(max);
    }
}
