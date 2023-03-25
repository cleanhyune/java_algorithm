package section3_two_pointers_sliding_window;

import java.util.Scanner;

public class IV_연속_부분수열 {

    /*
        N개의 수로 이루어진 수열이 주어집니다.

        이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.

        만약 N=8, M=6이고 수열이 다음과 같다면

        1 2 1 3 1 1 1 2

        합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt(), goal = sc.nextInt();
        int[] array = new int[length];
        for(int i=0; i<length; i++) array[i] = sc.nextInt();

        long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
        solve(array, goal);
        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
        System.out.println("첫번째 풀이 시간(m) : "+secDiffTime);


        beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
        trueSolve(array, goal);
        afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
        System.out.println("두번째 풀이 시간(m) : "+secDiffTime);
    }

    public static void solve(int[] array, int goal) {
       int sum;
       int answer = 0;
       for(int i=0; i<array.length; i++) {
           sum = 0;
           for(int j=i; j<array.length; j++) {
               sum += array[j];
               if(sum > goal) break;
               if(sum == goal) answer++;
           }
       }
       System.out.println(answer);
    }

    public static void trueSolve(int[] array, int goal) {
        int sum = 0, answer = 0, lt = 0;
        for (int i : array) {
            sum += i;
            if (sum == goal) answer++;
            while (sum >= goal) {
                sum -= array[lt++];
                if (sum == goal) answer++;
            }
        }
        System.out.println(answer);
    }

}
