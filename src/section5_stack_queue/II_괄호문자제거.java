package section5_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class II_괄호문자제거 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String context = sc.next();
        solve(context);
    }

    public static void solve(String context) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> answer = new Stack<>();
        for (char c : context.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            } else if(c == ')'){
                stack.pop();
            } else {
                if(stack.isEmpty()) {
                    answer.push(c);
                }
            }
        }
        System.out.println();
    }

}
