public class DuplicateElementsInTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1,2,3,4,5,6,12};
        int[] arr2 = new int[]{4,5,6,7,8,9,12};

        System.out.println("Duplicate elements are");
        for (int element1 : arr1) {
            for (int element2 : arr2) {
                if (element1 == element2){
                    System.out.println(element2);
                }
            }
        }
    }
}

