package section2_array;

import java.util.Scanner;

public class VIII_등수구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++) {
            arr[i] = sc.nextInt();
        }
        solve(arr, n);
    }

    public static void solve(int[] array, int n) {
        int grade;
        int[] resolve = new int[n];

        for(int i=0; i<n; i++) {
            grade = 1;
            for(int j=0;j<n;j++) {
                if(array[j] > array[i]) {
                    grade++;
                }
            }
            resolve[i] = grade;
        }

        for (int i : resolve) {
            System.out.print(i + " ");
        }
    }

}
