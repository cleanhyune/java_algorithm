package section2_array;

import java.util.Arrays;
import java.util.Scanner;

public class XI_임시반장정하기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][5];
        for(int i=0; i<n; i++) {
            for(int j=0;j<5;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        solve(arr, n);
    }

    public static void solve(int[][] array, int n) {
        int[] result = new int[n];
        int max = 0;
        for(int i=0; i<n; i++) {
            int[] index = new int[n];
            for(int j=0; j<5; j++) {
                int count = 0;
                for(int k=0; k<n;k++) {
                    if(i != k && array[k][j] == array[i][j]) {
                        if(index[k] == 0 ) {
                            index[k] = 1;
                            count++;
                        }
                    }
                }
                result[i] += count;
            }
            if(result[i] > max) max = result[i];
        }

        for(int i=0; i<n; i++) {
            if(result[i] == max) {
                System.out.print(i + 1);
                break;
            }
        }
    }

}
