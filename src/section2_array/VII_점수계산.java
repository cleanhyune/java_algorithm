package section2_array;

import java.util.Scanner;

public class VII_점수계산 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        solve(arr);
    }

    public static void solve(int[] array) {
        int count = 0;
        int score = 0;
        for (int i : array) {
            if(i == 1) {
                count++;
                score += count;
            } else {
                count = 0;
            }
        }

        System.out.println(score);
    }

}
