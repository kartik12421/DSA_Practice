import java.util.*;

public class replaceEWithI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        String result = "";

        for (int i = 0; i < original.length(); i++){
            char ch = original.charAt(i);
            if (ch == 'e' || ch == 'E') {
                result += 'i';
            } else {
                result += ch;
            }
        }
        System.out.println(result);
    }
}