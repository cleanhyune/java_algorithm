package section1_string;

import java.util.Scanner;

public class XI_문자열_압축 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();
        String solve = solve(phrase);
        System.out.println(solve);
    }

    public static String solve(String phrase) {

        char t = phrase.charAt(0);
        StringBuilder result = new StringBuilder();
        int count = 0, index = 0;

        for (char c : phrase.toCharArray()) {
            if(c == t) {
                count++;
            } else {
                result.append(t).append(count <= 1 ? "" : count);
                count = 1;
                t = c;
            }
            if(index == phrase.length() - 1) {
                result.append(t).append(count <= 1 ? "" : count);
            }
            index++;
        }

        return result.toString();
    }

}
