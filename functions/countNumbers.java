import java.util.Scanner;

public class countNumbers {

    public static void countNumbers() {
        Scanner sc = new Scanner(System.in);

        int positive = 0, negative = 0, zero = 0;
        int choice;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }

            System.out.print("Enter 1 to continue and 0 to stop: ");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zero numbers: " + zero);
    }

    public static void main(String[] args) {
        countNumbers();
    }
}