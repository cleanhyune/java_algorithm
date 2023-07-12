package section5_stack_queue;

import java.util.*;

public class III_크레인_인형뽑기 {

    /*
        문제 내용은 아래 주소에서 확인
        https://cote.inflearn.com/contest/10/problem/05-03
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Queue<Integer>> board = new ArrayList<>();
        List<Integer> popOrder = new ArrayList<>();

        for(int i=0; i<n*n; i++) {
            int lineNumber = i < n ? i : i % n;
            Queue<Integer> line;

            if(i < n) {
                Queue<Integer> newLine = new LinkedList<>();
                board.add(newLine);
                line = newLine;
            } else line = board.get(lineNumber);

            int input = sc.nextInt();
            if(input != 0) {
                line.add(input);
            }
        }

        int popCount = sc.nextInt();
        for(int i=0; i<popCount; i++) {
            popOrder.add(sc.nextInt() - 1);
        }

        solve(board, popOrder);
    }

    public static void solve(List<Queue<Integer>> board, List<Integer> popOrder) {
        Stack<Integer> userStack = new Stack<>();
        int popCount = 0;

        for (Integer lineNumber : popOrder) {
            Queue<Integer> line = board.get(lineNumber);
            if (line.isEmpty()) continue;

            Integer pickedDoll = line.poll();
            Integer lastDoll;

            if(userStack.isEmpty()) userStack.add(pickedDoll);
            else {
                lastDoll = userStack.lastElement();
                if(pickedDoll == lastDoll) {
                    popCount++;
                    userStack.pop();
                }
                else userStack.add(pickedDoll);
            }
        }

        System.out.println(popCount*2);
    }

}
