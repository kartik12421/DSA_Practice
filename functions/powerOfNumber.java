import java.util.Scanner;

public class powerOfNumber {

    public static int power(int x, int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= x;
        }

        return result;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter x: ");
            int x = sc.nextInt();

            System.out.print("Enter n: ");
            int n = sc.nextInt();

            System.out.println("Result = " + power(x, n));
        }
    }
}