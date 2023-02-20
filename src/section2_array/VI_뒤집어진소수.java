package section2_array;

import java.util.Scanner;

public class VI_뒤집어진소수 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        solve(arr);

    }

    public static void solve(int[] array) {
        for (int i : array) {
            int reverse = Integer.parseInt(new StringBuilder(String.valueOf(i)).reverse().toString());
            if(isPrimeNumber(reverse)) {
                System.out.print(reverse + " ");
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        if(n == 1) return false;
        for(int i=2; i<n/2; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

}
