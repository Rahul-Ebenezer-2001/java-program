import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
//        if (n==0){
//            System.out.println(a);
//        }else if (n==1){
//            System.out.println(b);
//        }else{
//            for (int i=2; i<=n; i++){
//                sum = a + b;
//                a = b;
//                b = sum;
//            }
//            System.out.println(sum);
//        }

        if (n==0){
            System.out.println(a);
        }else if(n==1){
            System.out.println(b);
        }else{
            int i = 2;
            while (i <= n){
                sum = a + b;
                a = b;
                b = sum;
                i+=1;
            }
            System.out.println(sum);
        }
    }
}
