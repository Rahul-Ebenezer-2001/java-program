public class Main {
    public static void main(String[] args) {
        int s = 1000;
//        if (s > 500){
//            s = s + 200;
//        }else{
//            s = s + 100;
//        }

        if (s > 1000){
            s += 100;
        }else if (s < 1000){
            s += 50;
        }else{
            s += 1;
        }
        System.out.println(s);
    }
}