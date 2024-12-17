import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(2);
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(2);
        System.out.println(list);
        list.set(1,8);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        for (int i=0; i<5; i++){
            list.add(input.nextInt());
        }
        System.out.println(list);



    }
}

