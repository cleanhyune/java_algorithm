package section3_two_pointers_sliding_window;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class I_두_배열_합치기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++) {
            arr2[i] = sc.nextInt();
        }

        solve(n, m, arr1, arr2);
    }

    public static void solve(int n, int m, int[] array1, int[] array2) {
        List<Integer> resolve = new ArrayList<>();
        int p1=0; int p2=0;
        while(p1 < n && p2 < m) {
            if(array1[p1] < array2[p2]) resolve.add(array1[p1++]);
            else resolve.add(array2[p2++]);
        }
        while(p1 < n) resolve.add(array1[p1++]);
        while(p2 < m) resolve.add(array2[p2++]);
        System.out.println(resolve);
    }

}
