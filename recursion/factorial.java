
public class factorial {

    public static int printFact(int n) {
        if(n == 1 || n == 0){
            return 1;
        }
        int fact_no1 = printFact(n - 1);
        int fact = n * fact_no1;
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        int output = printFact(n);
        System.out.println(output);
    }
}
