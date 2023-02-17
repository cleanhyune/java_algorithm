package section2_array;

import java.util.Scanner;

public class III_가위바위보 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            b[i] = sc.nextInt();
        }

        solve(n, a, b);

    }

    public static void solve(int n, int[] arr1, int[] arr2) {
        for(int i=0; i<n; i++) {
            System.out.println(checkMatch(arr1[i], arr2[i]));
        }
    }

    public static String checkMatch(int a, int b) {
        if(a == b) return "D";
        else if(a == 1 && b == 3) return "A";
        else if(a == 2 && b == 1) return "A";
        else if(a == 3 && b == 2) return "A";
        return "B";
    }

}
