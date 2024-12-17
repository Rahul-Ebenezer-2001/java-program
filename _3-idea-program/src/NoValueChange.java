public class NoValueChange {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a + " " + b);

        String name = "Kunal";
        swap2(name);
        System.out.println(name);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap2(String name){
        name = "Kishore";
    }
}
