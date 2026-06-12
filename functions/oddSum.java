public class oddSum {

    public static void oddNumSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            if (i % 2 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int n = 10;
        oddNumSum(n);
    }
}