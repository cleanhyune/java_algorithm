package section2_array;

import java.util.Scanner;

public class XII_멘토링 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) arr[i][j] = sc.nextInt();
        }
        solve(arr, m, n);
    }

    /*
        뭐지 이게 왜 되지...
     */

    public static void solve(int[][] array, int row, int col) {
        int result = 0;
        for(int i=0; i<col-1; i++) {
            int target = array[0][i];
            for(int j=i+1; j<col; j++) {
                int afterNum = array[0][j];
                int count = 0;
                for(int c=1; c<row; c++) {
                    for(int k=0;k<col;k++) {
                        if(array[c][k] == target) {
                            break;
                        }
                        if(array[c][k] == afterNum) {
                            count++;
                            break;
                        }
                    }
                }
                if(count == 0) {
                    result ++;
                }
            }
        }
        System.out.println(result);
    }

}
