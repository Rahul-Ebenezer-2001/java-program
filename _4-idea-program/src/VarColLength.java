import java.util.Arrays;

public class VarColLength {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));

        int[][] arr2 = {{1,2},{4,5,6},{7,8,9,10}};
        System.out.println(Arrays.deepToString(arr2));

        for (int row=0; row<arr2.length; row++){
            for (int col=0; col<arr2[row].length; col++){
                System.out.print(arr2[row][col] + " ");
            }
            System.out.println();
        }
    }
}
