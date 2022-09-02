public class StringReverse {

    public static void main(String[] args) {

        String name = "Sahal", reverse = "";
        char a;

        for (int i=0; i<name.length(); i++){
            a=name.charAt(i);
            reverse = a+reverse;
            System.out.println(reverse);
            System.out.println("------------");
        }
        System.out.println("Original "+name);
        System.out.println("Reversed "+reverse);
    }
}
