public class ConcatenateTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{6,7,8,9,0};
        int pos = 0;

        int[] arr3 = new int[arr1.length+arr2.length];

        for (int element : arr1) {
            arr3[pos] = element;
            pos++;
        }
        for (int element : arr2) {
            arr3[pos] = element;
            pos++;
        }
        for (int element : arr3) {
            System.out.println(element);
        }
    }
}
