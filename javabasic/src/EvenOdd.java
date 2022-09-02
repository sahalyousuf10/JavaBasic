public class EvenOdd {

    public static void main(String[] args) {

        int num = 3;
        boolean isEven = true;
        for (int i=1; i<=num; i++){
            isEven = !isEven;
        }
        if (isEven){
            System.out.println("Even");
        }
        else
            System.out.println("Odd");
    }
}
