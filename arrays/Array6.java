
import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        boolean isAscending = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]){
                isAscending = true;
            }
        }

        if(isAscending){
            System.out.println("desending order");
        } else{
            System.out.println("ascending order");
        }
    }
}