import java.util.*;

public class combinedLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        int totalLength = 0;

        for (int i = 0; i < n; i++){
            arr[i] = sc.next();
            totalLength += arr[i].length();
        }

        System.out.println(totalLength);
        
    }
}
