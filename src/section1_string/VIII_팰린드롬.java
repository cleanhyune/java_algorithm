package section1_string;

import java.util.Scanner;

public class VIII_팰린드롬 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();
        String solve = solve(phrase);
        System.out.println(solve);

    }

    public static String solve(String phrase) {
        phrase = phrase.toUpperCase().replaceAll("[^A-Z]", "");
        return phrase.equals(new StringBuilder(phrase).reverse().toString()) ? "YES" : "NO";
    }

}
