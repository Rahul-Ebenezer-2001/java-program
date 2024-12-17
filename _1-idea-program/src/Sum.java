import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int a = input.nextInt();
        System.out.print("Enter num2 : ");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("Sum : " + sum);
    }
}
