import java.util.Arrays;
import java.util.Collections;

public class Zad9 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4};
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i:arr){
            System.out.printf("%d ",i);
        }
    }
}
