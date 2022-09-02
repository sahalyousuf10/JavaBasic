public class SecondLargestInArray {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1,33,2,29,3,4,5,9,8,4,10,16,12,28,6,36};
        int last = 0;
        int sndLast = 0;
        int lastElement = arr1[1];

        for (int element : arr1) {
            if (element>lastElement){
                last = element;
                sndLast = lastElement;
                lastElement = element;
            }
        }
        System.out.println(sndLast);
        System.out.println(last);
    }
}
