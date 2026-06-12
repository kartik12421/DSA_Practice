
import java.util.Scanner;

public class greaterOfTwo {

    public static void biggerNumber(int a, int b){
        if (a == b){
            System.out.println("both are same");
        } else if(a > b){
            System.out.println("a is big");
        } else {
            System.out.println("b is big");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        biggerNumber(a, b);
    }
}