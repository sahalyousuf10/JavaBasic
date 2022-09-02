import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindMissingElement {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,7,4,5,6};
        int N = arr.length;
        //System.out.println(N);
        int i;
        int[] temp = new int[N + 1];
        for (i = 0; i < N; i++) {
//            System.out.println(arr[i]);
            temp[arr[i] - 1] = 1;
        }
        int ans = 0;
        for (i = 0; i <= N; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }
        System.out.println(ans);

        List<Integer> numList = Arrays.asList(1,2,7,4,6,5,3,9);
        List<Integer> sortedList;
        sortedList = numList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        int missing = 0;
        for (int j=0; j<sortedList.size()-1; j++){
            if (sortedList.get(j+1)-1 != sortedList.get(j)){
                missing = sortedList.get(j)+1;
            }
        }
        System.out.println(missing);

    }
}
