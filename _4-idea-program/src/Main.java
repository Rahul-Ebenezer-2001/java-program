import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // datatype[] variable_name = new datatype[size]
        Scanner input = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        System.out.println(Arrays.toString(arr));
//
//        String[] arr2 = (new String[3]);
//        System.out.println(Arrays.toString(arr2));

//        for (int i = 0; i < arr.length; i++){
//            System.out.print("Enter index " + i + " value : ");
//            arr[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//
//        for (int num : arr){
//            System.out.print(num + " ");
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        String[] str = new String[3];

        for (int i=0; i<str.length; i++){
            System.out.print("Enter index " + i + " value : ");
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));

    }
}