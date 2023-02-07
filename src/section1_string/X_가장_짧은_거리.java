package section1_string;

import java.util.Arrays;
import java.util.Scanner;

public class X_가장_짧은_거리 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase = sc.next();
        String x = sc.next();

       solve(phrase, x.charAt(0));
    }

    public static void solve(String phrase, char target) {
        int p = 1001, index = 0;
        int[] distanceArray = new int[phrase.length()];

        for (char c : phrase.toCharArray()) {
            if(c == target) {
                p = 0;
            } else {
                distanceArray[index] = ++p;
            }
            index++;
        }

        for (int i = phrase.length() - 1; i >= 0; i--) {
            if(phrase.charAt(i) == target) {
                p = 0;
            } else {
                p++;
                distanceArray[i] = Math.min(p, distanceArray[i]);
            }
        }

        for (int i : distanceArray) {
            System.out.print(i + " ");
        }
    }

}
