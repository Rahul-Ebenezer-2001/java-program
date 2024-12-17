import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i=0; i<arr.length; i++){
            System.out.print("Enter number : ");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> list = isPrime(arr);
        System.out.println("Prime : " + list);
    }

    static ArrayList isPrime(int[] arr){
        ArrayList<Integer> prime = new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            boolean flag = true;
            if (arr[i] <= 1){
                flag = false;
            }
            int c = 2;
            while (c*c <= arr[i]){
                if (arr[i] % c == 0){
                    flag = false;
                }
                c += 1;
            }
            if (flag && (c*c > arr[i])){
                prime.add(arr[i]);
            }
        }
        return prime;
    }
}
