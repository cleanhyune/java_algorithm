package section3_two_pointers_sliding_window;

import java.util.Scanner;

public class III_최대_매출 {

    /*
        현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.

        만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면

        12 15 11 20 25 10 20 19 13 15

        연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.

        여러분이 현수를 도와주세요.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] scores = new int[n];

        for(int i=0; i<n; i++) {
            scores[i] = sc.nextInt();
        }

        solve(scores, k);
    }

    public static void solve(int[] array, int k) {
        int answer, sum = 0;
        for(int i=0; i<k; i++) sum += array[i];
        answer = sum;

        for(int i=k; i<array.length; i++) {
            sum = sum - array[i - k] + array[i];
            if(sum > answer) answer = sum;
        }

        System.out.println(answer);
    }

}
