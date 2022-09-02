public class Palindrome {

    public static void main(String[] args) {

        int num = 1122332211, rev = 0, reminder;
        int originalNum = num;

        while (num != 0){
            reminder = num % 10;
            System.out.println(reminder);
            rev = rev * 10 + reminder;
            System.out.println(rev);
            num /= 10;
            System.out.println(num);
            System.out.println("------------");
        }
        if (originalNum == rev)
            System.out.println("The given number is palindrome");

        else
            System.out.println("The given number is not palindrome");


    }
}
