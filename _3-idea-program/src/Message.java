public class Message {
    public static void main(String[] args) {
        String msg = Message();
        System.out.println(msg);

        String msg2 = Message2("Rahul");
        System.out.println(msg2);
    }
    static String Message(){
        String greet = "Hi, how's it going?";
        return greet;
    }

    static String Message2(String name){
        String greet = "Hello " + name;
        return greet;
    }
}
