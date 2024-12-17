import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter dept : ");
        String dept = input.next();
        System.out.print("Enter empNo : ");
        int empNo = input.nextInt();


        switch(dept){
            case "IT":
                switch (empNo){
                    case 1:
                        System.out.println("Tharun");
                        break;
                    case 2:
                        System.out.println("Leela");
                        break;
                    default:
                        System.out.println("Enter valid empNo");
                        break;
                }
            case "ECE":
                switch (empNo){
                    case 1:
                        System.out.println("Nishanth");
                        break;
                    case 2:
                        System.out.println("Rohit");
                        break;
                    default:
                        System.out.println("Enter valid empNo");
                        break;
                }
            default:
                System.out.println("Enter valid dept");
                break;
        }

        switch(dept){
            case "IT":
                switch (empNo) {
                    case 1 -> System.out.println("Tharun");
                    case 2 -> System.out.println("Leela");
                    default -> System.out.println("Enter valid empNo");
                }
            case "ECE":
                switch (empNo) {
                    case 1 -> System.out.println("Nishanth");
                    case 2 -> System.out.println("Rohit");
                    default -> System.out.println("Enter valid empNo");
                }
            default:
                System.out.println("Enter valid dept");
                break;
        }
    }
}
