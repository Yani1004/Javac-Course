public class Zad3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int max = maxNum(arr);
        System.out.printf("The max is %d",max);
    }
    public static int maxNum(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

