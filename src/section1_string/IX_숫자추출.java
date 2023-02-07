package section1_string;

import java.util.Scanner;

public class IX_숫자추출 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();
        String solve = solve(phrase);
        System.out.println(solve);
    }

    public static String solve(String phrase) {
        StringBuilder result = new StringBuilder();

        for (char c : phrase.toCharArray()) {
            if(Character.isDigit(c) && (c != '0' || result.length() != 0)) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
