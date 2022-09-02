public class BinaryOrNot {

    public static void main(String[] args) {
        int num = 101010102;
        boolean b;
        if (num == 0 || num == 1
                || num < 0) {
            b = false;
        }
        while (num != 0) {
            if (num % 10 > 1) {
                b = false;
            }
            num = num / 10;
        }
        b = true;
        System.out.println(b);
    }
}
