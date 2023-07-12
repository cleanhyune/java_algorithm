package section5_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class V_쇠막대기 {

    /*
        문제 설명은 아래 링크에서 확인
        site: https://cote.inflearn.com/contest/10/problem/05-05
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prefix = sc.next();
        solve(prefix);
    }

    public static void solve(String prefix) {
        Stack<Character> stack = new Stack<>();
        char prevChar = '-';
        int result = 0;

        for (char c : prefix.toCharArray()) {
            if(c == '(') stack.push(c);
            else if(c == ')') {
                if(prevChar == '(') {
                    stack.pop();
                    result += stack.size();
                } else if(prevChar == ')') {
                    stack.pop();
                    result++;
                }
            }
            prevChar = c;
        }

        System.out.println(result);
    }

}
