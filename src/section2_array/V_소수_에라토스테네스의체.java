package section2_array;

import java.util.Scanner;

public class V_소수_에라토스테네스의체 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        int solve = solve(arr);
        System.out.println(solve);
    }

    public static int solve(int[] array) {
        int answer = 0;
        for(int i=2; i<array.length; i++) {
            if(array[i] == 0) {
                answer++;
                for(int j=i; j < array.length; j+=i) array[j] = 1;
            }
        }
        return answer;
    }

}
