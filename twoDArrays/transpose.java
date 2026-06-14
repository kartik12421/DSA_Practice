import java.util.*;


public class transpose {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter rows and columns: ");

      int n = sc.nextInt();
      int m = sc.nextInt();

      int arr[][] = new int[n][m];

      System.out.println("Enter matrix: ");
      for(int i = 0; i < n; i++){
         for (int j = 0; j < m; j++){
            arr[i][j] = sc.nextInt();
         }
      }

      System.out.println("original matrix: ");
      for(int i = 0; i < n; i++){
         for (int j = 0; j < m; j++){
            System.out.print(arr[i][j] + " ");
         }
         System.out.println();
      }

      //transpose
      System.out.println("transpose: ");
      for(int j = 0; j < m; j++){
         for (int i = 0; i < m; i++){
            System.out.print(arr[i][j] + " ");
         }
         System.out.println();
      }
   }
}

