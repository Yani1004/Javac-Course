public class Zad8 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {2,4,8,9,75,15,26,56,5};

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.printf("%d ", arr1[i]);
                }
            }
        }

    }
}
