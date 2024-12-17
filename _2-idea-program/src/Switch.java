import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String fruit = input.next();
//
//        switch (fruit){
//            case "Apple":
//                System.out.println("Red");
//                break;
//            case "Mango":
//                System.out.println("Yellow");
//                break;
//            case "Orange":
//                System.out.println("Orange");
//                break;
//            default:
//                System.out.println("White");
//                break;
//        }
        int day = input.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter 1-7");
        }
    }
}
