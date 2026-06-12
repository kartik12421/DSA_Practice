
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size: ");
        int n = sc.nextInt();
        String names[] = new String[n];

        System.out.println("enter names:");
        for(int i = 0; i < names.length; i++){
            names[i] = sc.next();
        }

        System.out.println("print names:");
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}