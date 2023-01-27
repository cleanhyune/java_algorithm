package section1_string;

import java.util.Scanner;

public class II_대소문자변환 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();
        String resolve = solve(phrase);
        System.out.println(resolve);
    }

    public static String solve(String phrase) {
        StringBuilder resolve = new StringBuilder();

        for (char c : phrase.toCharArray()) {
            if(Character.isLowerCase(c)) resolve.append(Character.toUpperCase(c));
            else if(Character.isUpperCase(c)) resolve.append(Character.toLowerCase(c));
        }
        return resolve.toString();
    }

}
