public class Scope {
    public static void main(String[] args) {
        int a = 10; // Anything defined outside cannot be defined inside
        int b = 20;
        {
            int c = 40; // Anything defined inside can be defined outside // Scope
            System.out.println(c);
            a = 30;
            System.out.println(a);
        }
        int c = 50;
        System.out.println(c);

        int sum = 0;
        for (int i=0; i<5;i++){
            int num1 = 1; // Scope
            sum += num1;
        }
    }

    static void find(int marks){
        int num = 50;
        System.out.println(marks);
    }
}
