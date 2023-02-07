package section1_string;

import java.util.Scanner;

public class XII_암호 {

    /*
        현수는 영희에게 알파벳 대문자로 구성된 비밀편지를 매일 컴퓨터를 이용해 보냅니다.
        비밀편지는 현수와 영희가 서로 약속한 암호로 구성되어 있습니다.
        비밀편지는 알파벳 한 문자마다 # 또는 *이 일곱 개로 구성되어 있습니다.
        만약 현수가 “#*****#”으로 구성된 문자를 보냈다면 영희는 현수와 약속한 규칙대로 다음과 같이 해석합니다.
        2. 바뀐 2진수를 10진수화 합니다. “1000001”을 10진수화 하면 65가 됩니다.
        현수가 4개의 문자를 다음과 같이 신호로 보냈다면
        #****###**#####**#####**##**
        이 신호를 4개의 문자신호로 구분하면
        #****## --> 'C'
        #**#### --> 'O'
        #**#### --> 'O'
        #**##** --> 'L'
        최종적으로 “COOL"로 해석됩니다.
        현수가 보낸 신호를 해석해주는 프로그램을 작성해서 영희를 도와주세요.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String phrase = sc.next();
        String solve = solve(number, phrase);
        System.out.println(solve);
    }

    public static String solve(int number, String phrase) {
        StringBuilder result = new StringBuilder();
        for (int i=0; i<number; i++) {
            int startIndex = i * 7;
            int lastIndex = startIndex + 7;

            String encrypt = phrase.substring(startIndex, lastIndex);
            encrypt = encrypt.replaceAll("#", "1").replaceAll("[*]", "0");
            int asciiCode = Integer.parseInt(encrypt, 2);
            result.append((char) asciiCode);
        }
        return result.toString();
    }
}
