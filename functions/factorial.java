
import java.util.Scanner;

public class factorial {

    public static void calcFactorial(int n){
        if(n<0) {
            System.out.println("Invalid value");
            return;
        }
        int fact = 1;
        for(int i = n; i >= 1; i--){
            fact *=i;
        }

        System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        calcFactorial(n);
    }
}