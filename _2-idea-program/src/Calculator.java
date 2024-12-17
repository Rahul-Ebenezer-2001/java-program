import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int ans = 0;
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Enter operator : ");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter number 1 : ");
                int a = input.nextInt();
                System.out.print("Enter number 2 : ");
                int b = input.nextInt();
                if (op == '+'){
                    ans = a + b;
                }
                if (op == '-'){
                    ans = a - b;
                }
                if (op == '*'){
                    ans = a * b;
                }
                if (op == '/'){
                    if(b!=0) {
                        ans = a / b;
                    }
                }
                if (op == '%'){
                    ans = a % b;
                }
            }else if (op == 'x' || op == 'X'){
                System.out.println("Finish");
                break;
            }else{
                System.out.println("Invalid Operator");
            }
            System.out.print("Output : ");
            System.out.println(ans);
        }
    }
}
