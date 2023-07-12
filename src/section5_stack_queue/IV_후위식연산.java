package section5_stack_queue;
import java.util.*;

public class IV_후위식연산 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prefix = sc.next();
        solve(prefix);
    }

    public static void solve(String prefix) {
        Stack<Integer> numbers = new Stack<>();
        for (char c : prefix.toCharArray()) {
            boolean isDigit = Character.isDigit(c);

            if(isDigit) numbers.add(Character.getNumericValue(c));
            else {
                Integer rn = numbers.pop();
                Integer ln = numbers.pop();
                int result = 0;

                switch (c) {
                    case '+':
                        result = ln + rn;
                        break;
                    case '-':
                        result = ln - rn;
                        break;
                    case '*':
                        result = ln * rn;
                        break;
                    case '/':
                        result = ln / rn;
                        break;
                }

                numbers.add(result);
            }
        }

        int result = numbers.pop();
        System.out.println(result);
    }

}
