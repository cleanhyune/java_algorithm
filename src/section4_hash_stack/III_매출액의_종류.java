package section4_hash_stack;

import java.util.*;

public class III_매출액의_종류 {

    /**
     *  현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를
     *
     * 각 구간별로 구하라고 했습니다.
     *
     * 만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
     *
     * 20 12 20 10 23 17 10
     *
     * 각 연속 4일간의 구간의 매출종류는
     *
     * 첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
     *
     * 두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
     *
     * 세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
     *
     * 네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
     *
     * N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
     *
     * 매출액의 종류를 출력하는 프로그램을 작성하세요.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++ ) {
            arr[i] = sc.nextInt();
        }
        solve(arr, m);
    }

    public static void solve(int[] arr, int m) {
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<=arr.length - m; i++) {
            Set<Integer> set = new HashSet<>();
            for(int j=0; j<m;j++) {
                set.add(arr[i+j]);
            }
            result.add(set.size());
        }
        StringJoiner sj = new StringJoiner(" ");
        for (Integer integer : result) {
            sj.add(String.valueOf(integer));
        }
        System.out.println(sj);
    }

    public static void trueSolveFunc() {

    }

}
