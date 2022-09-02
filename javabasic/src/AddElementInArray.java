public class AddElementInArray {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[arr1.length+1];
        int addElement = 6;
        int addAtIndex = 5;
        int pos = 0;

        for (int element : arr1) {
            arr2[pos] = element;
            pos++;
        }

        arr2[addAtIndex] = addElement;

        for (int element : arr2) {
            System.out.println(element);
        }
    }
}
