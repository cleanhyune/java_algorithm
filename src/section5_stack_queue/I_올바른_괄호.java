package section5_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class I_올바른_괄호 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        solve(s);
    }

    public static void solve(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if(c == '(') stack.push(c);
            else {
                if(stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                } else {
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }

}
