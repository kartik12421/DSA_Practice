
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter target x: ");
        int x = sc.nextInt();

        System.out.println("element found at index: ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                System.out.println(arr[i]);
            }
        }
        
    }
}