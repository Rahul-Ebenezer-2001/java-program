import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,1,2);
        mixed(3,4,"Name1","Name2","Name3");
    }

    static void fun(int ...a){
        System.out.println(Arrays.toString(a));
    }

    static void mixed(int a,int b,String ...v){
        System.out.println(a + " " + b + " " + Arrays.toString(v));
    }
}
