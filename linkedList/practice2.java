//Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.

import java.util.LinkedList;
import java.util.Scanner;

public class practice2 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            LinkedList<Integer> list = new LinkedList<>();

            System.out.println("Enter numbers between 1 and 50 (-1 to stop):");

            while (true) {
                int num = sc.nextInt();

                if (num == -1) {
                    break;
                }

                if (num >= 1 && num <= 50) {
                    list.add(num);
                } else {
                    System.out.println("Please enter a number between 1 and 50.");
                }
            }

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > 25) {
                    list.remove(i);
                    i--;
                }
            }

            System.out.println("Linked List after deleting elements greater than 25:");
            System.out.println(list);
        }
    }
}
