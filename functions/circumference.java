
import java.util.Scanner;

public class circumference {

    public static double circumferenceOfCircle(double r){
        double circumference = Math.PI * Math.pow(r, 2);
        return circumference;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        double res = circumferenceOfCircle(r);

        System.out.println(res);
        
    }
}