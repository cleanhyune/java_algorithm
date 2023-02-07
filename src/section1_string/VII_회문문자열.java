package section1_string;

import java.util.Scanner;

public class VII_회문문자열 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();
        String solve = solve(phrase);
        System.out.println(solve);
    }

    public static String solve(String phrase) {
        char[] chars = phrase.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (right > left) {
            if(!String.valueOf(chars[left]).equalsIgnoreCase(String.valueOf(chars[right]))) {
                return "NO";
            }
            left++;
            right--;
        }
        return "YES";
    }

}
