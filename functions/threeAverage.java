
import java.util.Scanner;

public class threeAverage {

    public static int threeNumAverage(int a, int b, int c) {
        return a + b + c / 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = threeNumAverage(a, b, c);

        System.out.println(average);
    }
}