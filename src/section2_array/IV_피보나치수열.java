package section2_array;

import java.util.Scanner;

public class IV_피보나치수열 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        solve(arr, n);
        for (int i : arr) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public static int[] solve(int[] array, int n) {
        for (int i=0; i<n ;i++) {
            if(i == 0 || i == 1) array[i] = 1;
            else array[i] = array[i - 1] + array [i - 2];
        }
        return array;
    }

}
