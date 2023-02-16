package section2_array;

import java.util.Scanner;

public class I_큰_수_출력하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        solve(arr);
    }

    public static void solve(int[] array) {
        int index = 0;
        for (int i : array) {
            if(index == 0) System.out.print(i + " ");
            else if(array[index - 1] < i) System.out.print(i + " ");
            index++;
        }
    }

}
