package section2_array;

public class III_가위바위보 {

    public static void main(String[] args) {

    }

    public static String checkMatch(int a, int b) {
        if(a == b) return "D";
        else if(a == 1 && b == 3) return "A";
        else if(a == 2 && b == 1) return "A";
        else if(a == 3 && b == 2) return "A";
        return "B";
    }

}
