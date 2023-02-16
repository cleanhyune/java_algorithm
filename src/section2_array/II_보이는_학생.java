package section2_array;

import java.util.Scanner;

public class II_보이는_학생 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr));
    }

    public static int solve(int[] array) {
        int mostTall = 0;
        int count = 0;
        for (int i : array) {
            if(i > mostTall) {
                count ++;
                mostTall = i;
            }
        }
        return count;
    }

}
