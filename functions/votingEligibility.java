
import java.util.Scanner;

public class votingEligibility {

    public static void isEligible(int age) {
    String eligibility = (age >= 18) ? "Eligible" : "Not Eligible";
    System.out.println(eligibility);
}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        isEligible(age);
        
    }
}