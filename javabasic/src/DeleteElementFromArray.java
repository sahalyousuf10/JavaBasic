public class DeleteElementFromArray {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[arr1.length-1];
        int removeIndex = 1;
//
        for (int i =0,k=0 ; i<=arr2.length; i++){
            if (i!=removeIndex){
                arr2[k] = arr1[i];
                k++;
            }
        }
        for (int element : arr2) {
            System.out.println(element);
        }
    }
}
