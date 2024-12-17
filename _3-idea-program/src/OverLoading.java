import java.util.Arrays;

public class OverLoading {
    public static void main(String[] args) {
        fun(3);
        fun("India");

        arr(2,3,4);
        arr("name1","name2","name3");

    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String a){
        System.out.println(a);
    }

    static void arr(int ...a){
        System.out.println(Arrays.toString(a));
    }

    static void arr(String ...a){
        System.out.println(Arrays.toString(a));
    }
}
