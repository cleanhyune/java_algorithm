package section1_string;

import java.util.ArrayList;
import java.util.Scanner;

public class VI_중복문자_제거 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();
        String solve = solve(phrase);
        System.out.println(solve);
    }

    public static String solve(String phrase) {
        ArrayList<Character> chars = new ArrayList<>();
        StringBuilder sdf = new StringBuilder();

        for (char c : phrase.toCharArray()) {
            if(!chars.contains(c)) {
                sdf.append(c);
                chars.add(c);
            }
        }

        return sdf.toString();
    }

}
