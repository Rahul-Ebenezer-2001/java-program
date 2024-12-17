import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();

        for (int i = 100; i< 1000; i++){
            if (isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isArmstrong(int n){
        int temp = n;
        int sum = 0;
        while (n > 0){
            int rem = n % 10;
            sum += rem * rem * rem;
            n = n / 10;
        }
        if (temp == sum){
            return true;
        }else{
            return false;
        }
    }

}
