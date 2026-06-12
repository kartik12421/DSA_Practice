
import java.util.Scanner;

public class findX {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter rows and cols: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        System.out.println("enter values: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("target value: ");
        int x = sc.nextInt();

        System.out.println("output: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.print(i + ", " + j);
                }
            }
            System.out.println();
        }
    }
}
