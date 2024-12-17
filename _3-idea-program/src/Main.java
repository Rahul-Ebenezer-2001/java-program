import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n1 : ");
        int n1 = input.nextInt();
        System.out.print("Enter n2 : ");
        int n2 = input.nextInt();
        int sum = n1 + n2;
        System.out.println("Sum : " + sum);
    }
}