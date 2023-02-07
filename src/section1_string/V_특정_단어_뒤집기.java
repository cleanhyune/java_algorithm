package section1_string;

import java.util.Scanner;

public class V_특정_단어_뒤집기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        word = solve(word);
        System.out.println(word);
    }

    public static String solve(String word) {

        char[] chars = word.toCharArray();
        int left = 0,  right = word.length() - 1;

        while(right > left) {
            if(isNotAlphabet(word.charAt(left))) {
                left++;
            } else if(isNotAlphabet(word.charAt(right))) {
                right--;
            } else {
                char tmp = word.charAt(left);
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
        }

        return String.valueOf(chars);
    }

    public static boolean isNotAlphabet(Character c) {
        return !Character.isAlphabetic(c);
    }

}
