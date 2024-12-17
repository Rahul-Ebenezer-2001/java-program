import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int[][] arr2d = new int[3][3];

         for (int row = 0; row < arr2d.length; row++){
             for (int col = 0; col < arr2d[row].length; col++){
                 System.out.print("Enter " + '[' + row + ']' + '[' + col + "] : ");
                 arr2d[row][col] = input.nextInt();
             }
        }

         // Output
//        for (int row = 0; row < arr2d.length; row++){
//            for (int col = 0; col < arr2d[row].length; col++){
//                System.out.print(arr2d[row][col] + " ");
//            }
//            System.out.println();
//        }

        // Output
        for (int[] a : arr2d){
            System.out.println(Arrays.toString(a));
        }

        System.out.println(Arrays.deepToString(arr2d));




    }
}
