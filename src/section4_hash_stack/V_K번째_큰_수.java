package section4_hash_stack;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class V_K번째_큰_수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        solve(array, k);
    }

    public static void solve(int[] arr, int k) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        int arrayLength = arr.length;
        for(int i=0; i<arrayLength; i++) {
            for(int j=i+1; j<arrayLength; j++) {
                for(int l=j+1; l<arrayLength; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for (Integer integer : set) {
            cnt++;
            if(cnt == k) {
                System.out.println(integer);
                return;
            }
        }

        System.out.println(-1);
    }

}
