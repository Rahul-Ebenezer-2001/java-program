public class Count {
    public static void main(String[] args) {
//        int n = 1385757879;
//        int count = 0;
//        while (n > 0){
//            int rem = n % 10;
//            if (rem == 7){
//                count += 1;
//            }
//            n = n / 10;
//        }
//        System.out.println(count);

        int n = 23478;
        int rev = 0;
        while (n > 0){
            int rem = n % 10;
            rev = rem + (rev * 10);
            n = n / 10;
        }
        System.out.println(rev);
    }
}
