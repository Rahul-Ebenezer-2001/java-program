import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i=0; i<arr.length; i++){
            System.out.print("Enter number : ");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        swap(arr,2,3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
