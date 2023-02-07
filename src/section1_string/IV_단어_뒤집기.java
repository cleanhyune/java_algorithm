package section1_string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IV_단어_뒤집기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wordsNumber = sc.nextInt();
        List<String> reverseWords = new ArrayList<>();

        for(int i = 0; i < wordsNumber; i++) {
            String reverseWord = solve(sc.next());
            reverseWords.add(reverseWord);
        }

        for (String reverseWord : reverseWords) {
            System.out.println(reverseWord);
        }
    }

    public static String solve(String word) {
        return new StringBuffer(word).reverse().toString();
    }

}
