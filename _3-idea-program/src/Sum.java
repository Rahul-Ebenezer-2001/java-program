import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int ans = sum();
//        System.out.println("Sum : " + ans);

        System.out.print("Enter n1 : ");
        int n1 = input.nextInt();
        System.out.print("Enter n2 : ");
        int n2 = input.nextInt();
        int ans2 = sum2(n1,n2);
        System.out.println("Sum : " + ans2);
    }
//    static int sum(){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter n1 : ");
//        int n1 = input.nextInt();
//        System.out.print("Enter n2 : ");
//        int n2 = input.nextInt();
//        int sum = n1 + n2;
//        return(sum);
//    }

    static int sum2(int n1,int n2){
        Scanner input = new Scanner(System.in);
        int sum = n1 + n2;
        return(sum);
    }
}
