import java.util.Arrays;
import java.util.Scanner;

public class MaxItem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0; i<arr.length; i++){
            System.out.print("Enter number : ");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int maximum = maxVal(arr);
        System.out.println("Max Value : " + maximum);
    }

    static int maxVal(int[] arr){
        int max = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
