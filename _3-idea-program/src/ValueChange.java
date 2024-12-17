import java.util.Arrays;

public class ValueChange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        modify(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void modify(int[] list) {
        list[1] = 100;
    }
}
